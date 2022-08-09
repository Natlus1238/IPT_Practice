package com.myntra.dynamicxpath;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Collections_Adobe {

	public static void main(String[] args) {
//		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
//		m.put('a', 1);
//		m.put('b', 2);
//		m.put('c', 3);
//		HashMap<Integer, Character> m1 = new HashMap<Integer, Character>();
//		Set<Entry<Character, Integer>> entrySet = m.entrySet();
//		for (Entry<Character, Integer> entry : entrySet) {
//			Character key = entry.getKey();
//			Integer value = entry.getValue();
//			m1.put(value, key);
//			
//			
//		}
//		System.out.println(m1);
		
		String s = "java  is a versitile language";
		char[] charArray = s.toCharArray();
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			
			if(m.containsKey(i)) {
				Integer value = m.get(i);
				m.put(charArray[i], value+1);
			}
			else {
				m.put(charArray[i], 1)	;
				}
				
				
				
				
			}
			
		System.out.println(m);
		
	}

}
