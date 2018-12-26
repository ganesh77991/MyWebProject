
package com.app.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ProjTest {

	
	@Before
	public void setUp() throws Exception {
		System.out.println("ProjTest.setUp()");
	}

	
	@After
	public void tearDown() throws Exception {
		System.out.println("ProjTest.tearDown()");
	}

	@Test
	public void test() {
		System.out.println("ProjTest.test()");
		System.out.println("Test Run Successfully.....");
	}

}
