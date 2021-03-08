package test;

import java.util.Arrays;

class Solution {

  public static void main(String[] args) {
    System.out.println(isHappy(19));
  }


  public static boolean isHappy(int n) {


    return isHappyHelper(n) == 1;
  }

  public static int isHappyHelper(int n) {
    String str = String.valueOf(n);
    int sum = 0;
    for (int i = 0; i < str.length(); i++) {
      sum += Math.pow(Integer.valueOf(str.substring(i, i+1)), 2);
    }

    if (sum == 1) {
      return sum;
    }

    return isHappyHelper(sum);

  }
}