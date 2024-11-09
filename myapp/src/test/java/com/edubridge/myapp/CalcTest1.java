package com.edubridge.myapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import  org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class CalcTest1 {
	private static  Calc c;
	//@BeforeEach for once constructor called
	@BeforeAll
	public static void setUp() {
		c=new Calc();
	}
	
	
	
	
    @Test
    public void testfindSquare() {
     //   Calc c = new Calc();
        int expected = c.findSquare(15);
        assertEquals(225, expected);
    }
    @Test
    public void testfindCube() { 
    	//Calc c=new Calc();
    	int expected =c.findCube(10);
    	assertEquals(1000,expected);
    }//object creation for every test
   


}

