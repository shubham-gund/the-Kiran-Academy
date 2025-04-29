package com.tka.test;

import com.tka.controller.A;

public class Test {

	public static void main(String[] args) {
		
		A v1 = new A();
		v1.m1(); // Package controller -> class A -> method m1()
		
		com.tka.test.A v2 = new com.tka.test.A() ;
		v2.m1(); // Package test -> class A -> method m1()
		 
	}

}
