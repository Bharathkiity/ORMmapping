package com.edubridge.myapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class InterestCalcTest {
	
	private static InterestCalc c;
	@BeforeAll
	public static void setUp() {
		c=new InterestCalc();
	}
	@Test
	public void testSI() {
		double actual=c.si(100,12, 1);
		double expected=1200;
		assertEquals(expected,actual);
	}
	@Test
	public void testSIWithBigAmount() {
		double actual=c.si(100000,12, 1);
		//double expected=12000;
		assertEquals(12000,actual);
	}
}
