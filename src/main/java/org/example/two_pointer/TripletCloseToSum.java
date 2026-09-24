package org.example.two_pointer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TripletCloseToSum {

    public static int sumCloseToTarget(List<Integer>list,int target){
        int max_int = Integer.MAX_VALUE;
        Integer result_sum=null;
        int n = list.size(),left,right;
        for(int i=0;i<n-1;i++){
            left=i+1;
            right = n-1;
            while(left<right){
                int sum=list.get(i)+list.get(left)+list.get(right);
                int diff = Math.abs(sum-target);
                if(diff<max_int){
                    max_int=diff;
                    result_sum=max_int;
                }
                if(sum==target){
                    return sum;
                }else if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return result_sum;
    }

    public static List<Integer> sumCloseToTargetList(List<Integer>list,int target){
        int max_int = Integer.MAX_VALUE;
        List<Integer>result=new ArrayList<>();
        int n = list.size(),left,right;
        for(int i=0;i<n-1;i++){
            left=i+1;
            right = n-1;
            while(left<right){
                int sum=list.get(i)+list.get(left)+list.get(right);
                int diff = Math.abs(sum-target);
                if(diff<max_int){
                    max_int=diff;
                    result=List.of(list.get(i),list.get(left),list.get(right));
                }
                if(sum==target){
                    return List.of(list.get(i),list.get(left),list.get(right));
                }else if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String args[]){
        List<Integer>list=List.of(-1,-1,0,1,2,4);
        int target = 10;
        int result=sumCloseToTarget(list,target);
        System.out.println("Sum close to "+target+" is "+result);
        System.out.println("==================================");
        List<Integer>resultAsList=sumCloseToTargetList(list,target);
        System.out.println("The three number that close to target are:");
        System.out.println(resultAsList);
    }
}
