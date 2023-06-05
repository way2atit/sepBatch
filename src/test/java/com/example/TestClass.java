package com.example;

public class TestClass {
	
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 0;
		
		
		int sum =  num1 + num2;
		System.out.println("Add :" +sum);	
		
		
		int sub =  num1 - num2;
		System.out.println("sub :" +sub);
		
		
		try {
			
			System.out.println("Inside try Block");
			int div =  num1 / num2;   // Ex
			System.out.println("div :" +div);
			
		}
		catch (Exception e) {
			System.out.println("Inside catch Block");
			e.printStackTrace();
			
		}
		
		
		finally {
			System.out.println("Inside finally Block");
			
		}
		
		

		//---
		
		int mult =  num1 * num2;
		System.out.println("mult :" +mult);
		
		
		
	}

}
