package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionEx2 {

	public static void main(String[] args) throws FileNotFoundException , InterruptedException , ArithmeticException ,NullPointerException {

		System.out.println("call main");
		//m1();
		
		
		
		try {
			m1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		
		
	}

	public static void m1() throws FileNotFoundException
	{

		System.out.println("call m1");
		m2();
		
	/*	try {
			m2();
		} catch (Exception e)
		{
		}*/
		
		// code
	}

	public static void m2()throws FileNotFoundException {
		System.out.println("call m2");
		
		FileInputStream fis = new FileInputStream(new File("location"));
		
		
		
		
	}

}
