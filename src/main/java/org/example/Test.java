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
	public int addTwoArray(int[] arr, int[]arr2) {
		int sum=0;
		int sum2=0;
		int sumall=0;
		for(int a=0;a<arr.length;a++) {
			sum = sum+arr[a];
		}
		for(int b=0;b<arr2.length;b++) {
			sum2 = sum2+arr2[b];
		}
		return sumall = sum+sum2;
	}
	

}
