package com.qa.qacommunity;

public class Runner {

	public static void main(String[] args) {
		
		Person Daniel = new Person ("Daniel", "brown", 27, 188);
		Person Reece = new Person ("Reece", "brown", 18, 189);
		Person Roy = new Person ("Roy", "Red", 58, 160);
		Person Derek = new Person ("Derek", "Blonde", 78, 155);
		
		Daniel.greet();
		Reece.greet();
	}
	
}
