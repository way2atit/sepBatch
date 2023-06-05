package com.example;

public class ExceptionEx1 {
	
	public static void main(String[] args) {
		int value = m1();
		//System.out.println(value);
		
		
		
	
		
		
		
	}

	public static int m1() {
		
		try {
			int num = 10/0;  // ex
			
			// data base -- open
			// code---  ex
			return 100;
			
			
		} catch (Exception e) {
			System.out.println("Catch Block");
			
			return 200;		
		}
		
		
		
		
		
	}

}
