package org.example.two_pointer;

import java.util.ArrayList;
import java.util.List;

public class TripletSumZero {

    public static List<List<Integer>>tripletSumZero(List<Integer>list){
        int n=list.size();
        List<List<Integer>>result=new ArrayList<>();
        for(int i=0;i<n-2;i++){
            if(i>0 && list.get(i)==list.get(i-1))continue;
            int sum=-1*list.get(i);
            int left=i+1;
            int right=n-1;
            while(left<right){
                if(sum==(list.get(left)+list.get(right))){
                    result.add(List.of(list.get(i),list.get(left),list.get(right)));
                    left++;
                    right--;
                    while(left<n && list.get(left)==list.get(left-1))
                        left++;
                    while(right>=0 && list.get(right)==list.get(right+1))
                        right--;
                }else if(sum>(list.get(left)+list.get(right))){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String [] args){
        List<Integer>list=List.of(-1,0,1,2,-1,4);
        List<Integer>sortedList=list.stream().sorted().toList();
        List<List<Integer>>result=tripletSumZero(sortedList);
        System.out.println("Triplet sum of zero are : ");
        for(List<Integer>tripletSumZero : result){
            System.out.println(tripletSumZero +" = 0");
        }
    }
}
