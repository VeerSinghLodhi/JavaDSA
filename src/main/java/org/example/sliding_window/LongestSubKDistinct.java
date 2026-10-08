package org.example.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LongestSubKDistinct {

    public static int longestSubKDistinct(String str,int k){
        int low=0,n=str.length(),result=-1;
        Map<Character,Integer>freq=new HashMap<>();
        for(int high=0;high<n;high++){
            char ch=str.charAt(high);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
            while(freq.size()>k){
                char leftChar=str.charAt(low);
                freq.put(leftChar,freq.get(leftChar)-1);
                if(freq.get(leftChar)==0)
                    freq.remove(leftChar);
                low++;
            }
            if(freq.size()==k){
                result = Math.max(result,high-low+1);
            }
        }
        return result;
    }

    public static void main(String [] args){
        String str = "aabacbebebe";
        int k = 3;
        int result = longestSubKDistinct(str,k);
        System.out.println("Result is "+result);
    }
}
