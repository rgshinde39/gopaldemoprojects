package org.example;

//import java.util.ArrayList;

public class MissingNum {
	public int findMissingNum(int[] arr){
		//ArrayList<Integer> l = new ArrayList<>();
		int sum=0;
		int sum2=0;
		int missingNum=0;
		for(int d=1;d<arr.length+2;d++) {
			sum=sum+d;
		
		}
		
		for(int a=0;a<arr.length;a++) {
			 sum2 += arr[a];
		}
		
		return missingNum = sum - sum2;
	}

}
