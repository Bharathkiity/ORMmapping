package com.edubridge.myapp;
//static import-call directly 
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcTest {
	
	private static Calc c;
	
	
	@BeforeAll//use static method
	//for all test cases ex
	//@BeforeEach//execution for each method only once &constrctor called 
	public static void setUp() {
		c=new Calc();//no need to create 
		//s=new InterestCalc();
	}
	@AfterAll
	//@AfterEach
	public static void tearUp() {
		c=null;
		
	}
	@Test
	public void testFindSquare() {
		
		int actual =c.findSquare(10);
		int expected=100;
		assertEquals(expected, actual);
	}
	@Test
	public void testFindCube() {
		
		assertEquals(1000,c.findCube(10));
	}

	
}
