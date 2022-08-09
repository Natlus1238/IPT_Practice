package com.myntra.dynamicxpath;

import java.util.LinkedList;

public class Adobe_Arrays {
	
	public void arrayexample(int a[], int b[]) {
		 int count =0;
//		 LinkedList<Integer> l = new LinkedList<Integer>();
		 for (int i = 0; i < a.length; i++) {
			 for (int j = 0; j < b.length; j++) {
					if(a[i]==b[j]) {
						count++;
					}
				}
		}
		 if (count==a.length || count==b.length) {
			System.out.println("All elements are present");
		}
		 else {
			System.out.println("Some elements are missing");
		}

	}

	public static void main(String[] args) {
		Adobe_Arrays arr = new Adobe_Arrays();
		int ar[] = {1,2,3,4};
		int br[] = {5,8,9,1,3,2,5,4};
		
		arr.arrayexample(br,ar);
	}

}
