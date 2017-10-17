package com.example.bean;

import static org.junit.Assert.*;

import org.junit.Test;

public class IdTest {

	@Test
	public void testValidId() {
		CompanyIdentification id = new CompanyIdentification();
		String expected = "8";
		String actual =  id.calculateCheckNumber("2029188") + "";
		assertEquals(expected,actual);
	}

}
