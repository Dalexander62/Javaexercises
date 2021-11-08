package com.qa.qacommunity;

public class StringsDemo {

	public static void main(String[] args) {
		
		String myMainStr = "These are stringy strings";
		
		String mySillyStr = new String("This is a long one");
		
		String myStr3 = "This string is ropey";
		
		System.out.println(myMainStr==mySillyStr);
		
		int stringLength=mySillyStr.length();
		
//		System.out.println("String length is " + stringlength);
		
		String str1 = "yesterday it was raining".concat(", today it is sunny");
		String str2 = "today it is sunny";
		
		String aSubString1 = str2.substring(0, 11);
		String aSubString2 = str1.substring(16, 24);
		System.out.println(aSubString1 + aSubString2);
		
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toUpperCase()+", "+str2.toUpperCase());
		

		System.out.println(str1.contains("SO"));
		
		
		

		}
		
		
	}
	

