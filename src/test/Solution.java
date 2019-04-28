package test;

import java.util.HashMap;

//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: array) {
            if(!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num)+1);
            }
        }

        int flag = 0;
        for(int num: array) {
            if(map.get(num) == 1) {
                if(flag == 0) {
                    num1[0] = num;
                } else {
                    num2[0] = num;
                }
            }
        }

    }
}