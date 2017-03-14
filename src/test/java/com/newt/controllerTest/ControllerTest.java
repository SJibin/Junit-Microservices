package com.newt.controllerTest;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.newt.ProductWareHouseMicroServiceApp;
import com.newt.controller.ProductsController;
import com.newt.entity.Products;
import com.newt.service.ProductServiceImp;
import com.newt.service.ProductsService;
public class ControllerTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductsController.class);
	
	@InjectMocks
	Products product;
		
	@Mock
	ProductsService productService;	
	
	@Before
    public void setUp() {
		MockitoAnnotations.initMocks(this);
		product.setProductId(1);
		product.setProductName("Car");
		product.setPrice(76767.87);
		Mockito.when(productService.getProductsByProductId(1)).thenReturn(product);
		
	}
	@Test
	public void testgetProductId() {
		ProductsController productController=new ProductsController();
		productController.setProductsService(productService);
		assertSame(1, productService.getProductsByProductId(1).getProductId());
		LOGGER.debug("The Id is ", productService.getProductsByProductId(1));
	}
	
	
}
