package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       Test tt = new Test();
      int result =  tt.addTwoNum(10, 20);
      System.out.println(result);
      int re = tt.multTwoNum(5, 10);
      System.out.println(re);
      int[] arr = {1,2,1,2,3,4,5,3};
      ArrayList<Integer> a = tt.findUnicNumArr(arr);
      System.out.println(a);
      int[] am = {1,2,3,4,6,7};
      MissingNum mm = new MissingNum();
     int ms = mm.findMissingNum(am);
     System.out.println(ms);
    }
}