package com.myntra.dynamicxpath;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

public class String_Vowel_Count {

	public static void main(String[] args) {
		String s = "I am Test Engineer";
		
		String[] str = s.split(" ");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String string : str) {
		int count = 0;	
		for (int i =0; i<string.length(); i ++){
			char ch = string.charAt(i);
		if (ch == 'a'||ch =='A'||ch =='e'||ch =='E'||ch =='i'||ch =='I'||ch =='O'||ch =='o'||ch =='U'||ch =='u'){
		count++;
		}

	}
		hm.put(string, count);
}
		LinkedList<Integer>l = new LinkedList<Integer>();
		System.out.println(hm);
		Set<Entry<String, Integer>> entrySet = hm.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			Integer value = entry.getValue();
			l.add(value);
		}
		System.out.println(Collections.max(l));
}

}
