package org.example.two_pointer;

import java.util.List;

public class TripletSmallerSum {

    public static int smallerSumCount(List<Integer>list,int target){
        int left,right,ans=0,n=list.size();
        for(int i=0;i<n-2;i++){
            left=i+1;
            right=n-1;
            while(left<right){
                int sum=list.get(i)+list.get(left)+list.get(right);
                if(sum>=target){
                    right--;
                }else{
                    ans = ans+(right-left);
                    left++;
                }
            }
        }
        return ans;
    }

    public static void main(String [] args){
        List<Integer> list = List.of(-2,0,1,3);
        int target= 4;
        int result = smallerSumCount(list,target);
        System.out.println("Result "+result);
    }
}
