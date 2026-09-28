package org.example.sliding_window;

public class SecondQuestion {
    public static int minSubArrayLen(int target, int[] nums) {
        int n=nums.length,low=0,high=0,sum=0;
        int result=Integer.MAX_VALUE;
        while(high<n){
            sum+=nums[high];
            while(sum>=target){
                int len = high-low+1;
                result=Math.min(result,len);
                sum-=nums[low];
                low++;
            }
            high++;
        }
        return result==Integer.MAX_VALUE?0:result;
    }

    public static void main(String [] args){
        int [] arr={1,2,4,4};
        int target = 4;
        int minSubArrayLength = minSubArrayLen(target,arr);
        System.out.println("Min Sub Array Length "+minSubArrayLength);
    }
}
