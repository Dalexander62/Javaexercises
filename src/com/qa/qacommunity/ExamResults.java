package com.qa.qacommunity;

public class ExamResults {
	public static double physics;
	public static double chemistry;
	public static double biology;
	public static double total;
	public static double percentage;
	

	public static void main(String[] args) {
		
		method1(70, 80, 50);
		method2();
		
		
	}
	
	public static void method1(double physGrade, double chemGrade, double bioGrade ) {
		physics = physGrade;
		chemistry = chemGrade;
		biology = bioGrade;
		total = physics+chemistry+biology;
		System.out.println("Your physics grade is "+physics);
		System.out.println("Your chemistry grade is "+chemistry);
		System.out.println("Your biology grade is "+biology);
		System.out.println("Your total grade is "+total);
		
		
	}
	
	public static void method2() {
		percentage = (total*100/450);
		System.out.println("Your total percentage is "+percentage+"%");
		
	}
	
	
	
}
