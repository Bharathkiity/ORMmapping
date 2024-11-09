package com.edubridge.myapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MyMathTest {

	private static MyMath m;
	@BeforeAll
	public static void setUp() {
		m=new MyMath();
	}
	@Test
	public void testEven() {
		boolean actual=m.isEven(2);
		boolean expected=true;
		assertEquals(expected,actual);
	}
	@Test
	public void testAuthenticate() {
		boolean actual=m.isAuthenticate("admin1","admin1234");
		boolean expected=true;
		assertEquals(expected,actual);
	}
	
}
