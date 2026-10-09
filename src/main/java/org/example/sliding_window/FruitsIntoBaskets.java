package org.example.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBaskets {

    public static int totalFruits(int [] fruits){
        int low=0,high,n=fruits.length,result=-1;
        Map<Integer,Integer>freq=new HashMap<>();
        for(high=0;high<n;high++){
            int fruit = fruits[high];
            freq.put(fruit,freq.getOrDefault(fruit,0)+1);
            while(freq.size()>2){
                int lowerNum = fruits[low];
                freq.put(lowerNum,freq.getOrDefault(lowerNum,0)-1);
                if(freq.get(lowerNum)==0){
                    freq.remove(lowerNum);
                }
                low++;
            }
            if(freq.size()<=2){
                int len = high-low+1;
                result = Math.max(result,len);
            }
        }
        return result;
    }

    public static void main(String [] args){
        int [] fruits = {1,2,3,2,2};
        System.out.println("Number of Fruits is "+totalFruits(fruits));
    }
}
