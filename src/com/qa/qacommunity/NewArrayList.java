package com.qa.qacommunity;

import java.util.ArrayList;
import java.util.List;

public class NewArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String[] fruits = new String[7];
//		fruits[0] = "Apple";
//		fruits[1] = "Strawberry";
//		fruits[2] = "Kiwi";
//		fruits[3] = "Banana";
//		fruits[4] = "Grapes";
//		fruits[5] = "Watermelon";
//		fruits[6] = "Mango";
//		System.out.println(fruits);
//		
	
		
		List<String>fruitList = new ArrayList();
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		fruitList.add("Kiwi");
		fruitList.add("Banana");
		fruitList.add("Grapes");
		fruitList.add("Watermelon");
		fruitList.add("Mango");
		
		fruitList.remove("Grapes");
		fruitList.clear();
		fruitList.add("Raspberries");
		System.out.println(fruitList);
		System.out.println(fruitList.get(2));
		fruitList.set(0, "Fruit salad");
		System.out.println(fruitList);
		
		for (int i = 0; i <fruitList.size(); i++) {
			System.out.println(fruitList.get(i));
		}
		
		
		
	
		
		
	}

}
