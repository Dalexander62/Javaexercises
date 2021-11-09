package com.qa.qacommunity;

import java.util.ArrayList;
import java.util.List;

public class NewArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] fruitsList = new int[7];
		
		fruitsList[0] = 1;
		fruitsList[1] = 2;
		fruitsList[2] = 3;
		fruitsList[3] = 4;
		fruitsList[4] = 5;
		fruitsList[5] = 6;
		fruitsList[6] = 7;
		
		for (int i : fruitsList) {
		System.out.println(i);
		
		}
		
	
		
		List<String>fruitList = new ArrayList<>();
		
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
