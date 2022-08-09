package com.myntra.dynamicxpath;

public class Double_Char {

	public static void main(String[] args) {

		String s = "Hello";
		String result = "";
		int i = 0;
		
	while (i < s.length()) {
		char charac = s.charAt(i);
		result = result + charac + charac;
		i++;
	}
//		for (int i = 0; i < s.length(); i++) {
//			char charac = s.charAt(i);
//			result = result + charac + charac;
//		}
		System.out.println(result);
		
		
		
		
		
		
		
		
		
	}

}
