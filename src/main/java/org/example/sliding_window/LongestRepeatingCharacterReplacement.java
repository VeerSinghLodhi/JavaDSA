package org.example.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {

    public static int find(int [] charArr){
        int maxCharFreq=-1;
        for(int i=0;i<255;i++){
            maxCharFreq=Math.max(charArr[i],maxCharFreq);
        }
        return maxCharFreq;
    }

    public static int countWithReplacementCharacter(String s,int k){
        int n=s.length();
        int low=0,high,result=Integer.MIN_VALUE;
//        Map<Character,Integer>freq=new HashMap<>();
        int charArr[]=new int[255];
        for(int i=0;i<255;i++)
            charArr[i]=0;
        for(high=0;high<n;high++){
            char ch=s.charAt(high);
            charArr[ch]++;

        }

        return 0;
    }
    public static void main(String [] args){
        String str = "AABABBA";
        int result = countWithReplacementCharacter(str,1);
        System.out.println("Result is "+result);
    }
}
