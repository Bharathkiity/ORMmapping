package com.edubridge.myapp;

public class MyMath {
	public  void MyMath() {
		System.out.println("mymath object is created");
	}
	
	String uname="admin";
	String password="admin123";
	
	public boolean isEven(int num) {
		return num%2==0;
	}
	public boolean isAuthenticate(String Uname,String password) {
		if(uname.equals(uname)&&password.equals(password)) {
			return true;
		}else {
			return false;
		}
	}
}
