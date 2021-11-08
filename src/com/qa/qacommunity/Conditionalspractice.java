package com.qa.qacommunity;

public class Conditionalspractice {
	
	public static void main(String[] args) {
		
		numbersJava();
		
	}

	
	public static void numbersJava() {
		int number = 21;
		
		if(number<20) {
			System.out.println("Number is less than or equal to 20");
		} else if(number<40) {
			System.out.println("Number is between 20 and 40");
		} else {
			System.out.println("Number is greater than or equal to 40");
			
		}
	}
}
