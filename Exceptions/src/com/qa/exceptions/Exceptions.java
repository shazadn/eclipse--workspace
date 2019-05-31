package com.qa.exceptions;

import java.io.IOException;

public class Exceptions {
 public static void main (String [] args) {
//	 try {
//	 int num = 3/0;
//	 } catch (ArithmeticException e) {
//		 
//		 e.printStackTrace();
//		System.out.println(e.toString());
//		 System.out.println("Computer exploding noise");
//	 }
	 
//	 throw new ArithmeticException();
	 
//	 try {
//	 method1();
//	 } catch (ArithmeticException e) {
//		 System.out.println("bad method");
//	 }
// }
// 
// public static void method1() {
//	 throw new ArithmeticException();
//
// }
	 Exceptions app = new Exceptions();
	 app.method1();
;
}
 
 public void method1() {
	  method2();
 }
 
 public void method2() throws IOException {
	 throw new IOException();
 }
 
 
}