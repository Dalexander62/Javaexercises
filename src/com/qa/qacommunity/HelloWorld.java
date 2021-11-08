package com.qa.qacommunity;

public class HelloWorld {
	
	public static void main(String[] args) {
		divide(10, 20);
	//		System.out.println(multiply(2, 4));
	//		System.out.println(substract(35, 120));
	//		System.out.println(divide(300, 4));
			
	}
	
	public static int multiply(int num1, int num2) {
		return num1*num2;
	}

	
	public static int substract(int num3, int num4) {
		return num3-num4;
	}

	public static double divide(double num5, double num6) {
		
		if (num5>num6) {
			System.out.println("first number is less than the second");
			return num5;
		} else {System.out.println("second number is greater than the first");
			return num5/num6;
		}
	
	}
	

}

