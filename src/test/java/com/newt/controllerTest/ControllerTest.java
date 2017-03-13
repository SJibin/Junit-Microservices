package com.newt.controllerTest;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.newt.ProductWareHouseMicroServiceApp;
import com.newt.controller.ProductsController;
import com.newt.entity.Products;
import com.newt.service.ProductServiceImp;
import com.newt.service.ProductsService;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=ProductWareHouseMicroServiceApp.class)
public class ControllerTest {
	Products product;
	@Autowired
	ProductsService productsService;
	
	@Autowired
	MockMvc mvc;
	
	@Autowired
	ProductsController productsController;
	
	@Mock
	ProductsService productServiceMock;
	
	@InjectMocks
	ProductsController productsControllerMock;
	
	@Before
    public void setUp() {
		MockitoAnnotations.initMocks(this);
		
		
	}
	@Test
	public void testgetAllProducts(){
		
		
		
		
		
	}

}
