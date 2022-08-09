package com.myntra.dynamicxpath;

public class String_Duplicate_Bolt {

	public static void main(String[] args) {
		String s ="my name is Sultan is my";
		String[] str = s.split(" ");
		
		for (int i = 0; i < str.length; i++) {
		int count =0;
			for (int j = i+1; j < str.length; j++) {
				if (str[i].equalsIgnoreCase(str[j])) {
					count++;
				}
			}
			if (count>1) {
				System.out.println(str[i]);
			}
		}
	}

}

