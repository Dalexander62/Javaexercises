package com.qa.qacommunity;

public class Person {
	
	private String name;
	private String hairColour;
	private int age; 
	private double height;
	
	
	public Person(String name, String hairColour, int age, double height) {
		super();
		this.name = name;
		this.hairColour = hairColour;
		this.age = age;
		this.height = height;
	}


	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	} 
	
	public void greet() {
	System.out.println("Welcome, my name is " + name + " and I am " + age + " years old. I am " + height + " and I have " + hairColour + " hair. ");

	
}

}