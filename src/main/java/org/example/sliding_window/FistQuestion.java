package org.example.sliding_window;

public class FistQuestion {

    public static int maxSubArraySum(int[] arr, int k) {
        int n=arr.length;
        if(n==0)return 0;
        int windowSum=0,low=0,high=k-1;
        for(int i=0;i<=high;i++){
            windowSum+=arr[i];
        }
        int maxSum=windowSum;
        while(high<n)
        {
            maxSum=Math.max(maxSum,windowSum);
            low++;
            high++;
            if(high==n)
                break;
            windowSum-=arr[low-1];
            windowSum+=arr[high];
        }
        return maxSum;
    }


    public static void main(String [] args){
        int [] arr ={100,200,300,400,500};
        int k=2;
        int result = maxSubArraySum(arr,k);
        System.out.println("Result is "+result);
    }
}
