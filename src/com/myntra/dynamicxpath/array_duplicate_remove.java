package com.myntra.dynamicxpath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class array_duplicate_remove {
	public static void main(String[] args) {
		
		
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(5);
		l.add(3);	
			
		int size = l.size();
		System.out.println(size);
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).equals(l.get(i+1))) {
				l.remove(i);
				l.remove(i+1);
			
			}
			
			int size = l.size();
			
		}
		
		
	
		
		System.out.println(l);
		
		
	
		
		
		
		
		
	}
	
	
}
