package com.niit.shoppingcart.testcase;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.domain.Category;
import com.niit.shoppingcart.domain.Supplier;

import junit.framework.Assert;

public class SupplierTestCase {

	
	@Autowired
	private static Supplier supplier;

	@Autowired
	private static SupplierDAO supplierDAO;

	
	@BeforeClass
	public static void init() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();

		supplier = (Supplier) context.getBean("Supplier");

		
		supplierDAO = (SupplierDAO) context.getBean("SupplierDAO");

		
	}

	// TEST CASES

	@Test
	public void createTestCase() {
		supplier.setId("SP!!1");
		supplier.setName("Himanshu Singh");
		supplier.setAddress(" Rewa (M.P.) India ");

		boolean flag = supplierDAO.save(supplier);

		// compare what you are excepting VS what you are getting from save
		// method

		Assert.assertEquals("createTestCase", true, flag);

	}
	
	
	
}
