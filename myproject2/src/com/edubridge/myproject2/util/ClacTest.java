package com.edubridge.myproject2.util;

import com.edubridge.myproject1.util.Calc;
import com.edubridge.myproject3.util.InterestClac;
	
public class ClacTest {
	public static void main(String[] args) {
	int square =Calc.findSquare(10);
	int cube =Calc.findCube(10);
	
	System.out.println(square);
	System.out.println(cube);
	
	double Interest=InterestClac.findSimpleInterest(100.00,200.00,3000.00);
			
	System.out.println(Interest);
}
}