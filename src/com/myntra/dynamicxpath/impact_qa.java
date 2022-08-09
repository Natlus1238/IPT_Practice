package com.myntra.dynamicxpath;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class impact_qa {

	public static void main(String[] args) {
		int[] d ={10,15,25,1,10,25,15,22,33,11,17};
		    
		    int length =d.length;
		    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		    for(int i = 0; i<length; i++){
		        if (hm.containsValue(d[i])) {
		        	int value = hm.get(d[i]);
		            hm.put(d[i], value+1);
				}
		            
		        else{
		            
		            hm.put(d[i], 1);
		        }
		        
		    }
		       System.out.println(hm);
		       
		       Set<Entry<Integer, Integer>> entrySet = hm.entrySet();
		       for (Entry<Integer, Integer> entry : entrySet) {
				if (entry.getValue()>1) {
					System.out.println(entry);
				}
			}
	}
}

