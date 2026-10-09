package org.example.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutDuplicates {

    public static int longestSubStringLengthFunction(String str){
        int low=0,high,n=str.length(),result=Integer.MIN_VALUE;
        Map<Character,Integer>freq = new HashMap<>();
        for(high=0;high<n;high++){
            char ch = str.charAt(high);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
            int k = high-low+1;
            while(freq.size()<k){
                char lowerChar = str.charAt(low);
                freq.put(lowerChar,freq.getOrDefault(lowerChar,0)-1);
                if(freq.get(lowerChar)==0)
                    freq.remove(lowerChar);
                low++;
                k=high-low+1;
            }
            result = Math.max(result,high-low+1);
        }
        return result;
    }

    public static void main(String [] args){
        String str = "pwwkew";
        int longestSubStringLength = longestSubStringLengthFunction(str);
        System.out.println("Longest Sub String length "+longestSubStringLength);
    }
}
