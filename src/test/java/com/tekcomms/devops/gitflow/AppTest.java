package com.tekcomms.devops.gitflow;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {

	// UNUSED test controls
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}
//
//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}

	@Test
	public void testGetMessage() {
		String message = "Hello Test Case!";
		App app = new App(message);
		String tests[] = {message};
		String results[] = {app.getMessage()};
		assertArrayEquals("Consructor Messaage Test", tests, results);
		
	}

}
