package com.example;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 10;
		
		String name = null;
		
		
		try {
			System.out.println("try  block");
			int div = num1 /num2;  // Arthi - Ex
			System.out.println("div :" +div);
			   
			int l = name.length();
			System.out.println("Length is : "+l);
			
			
		}
		
		catch (ArithmeticException e) {
			System.out.println(" ArithmeticException ");
		}
		catch (NullPointerException e) {
			System.out.println(" NullPointerException ");
		}
		
		
		catch (Exception e)  // class-- Parent 
		{	
			
			e.printStackTrace();
		}
		
		
		finally 
		{
			System.out.println("finally block");
		}
		
		
		
	}
	

}
