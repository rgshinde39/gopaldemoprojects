package org.example;

import java.util.ArrayList;

public class Test {
	public int addTwoNum(int a, int b) {
		return a+b;
	}
	public int multTwoNum(int a, int b) {
		return a*b;
	}
	public ArrayList<Integer> findUnicNumArr(int[] arr ){
		ArrayList<Integer> aa = new ArrayList<>();
		for(int a=0;a<arr.length;a++) {
			for(int b=a+1;b<arr.length;b++) {
				if(arr[a] == arr[b]) {
					 aa.add(arr[a]);
				}
			}
		}
		return aa;
	}
	

}
