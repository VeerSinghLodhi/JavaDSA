package org.example.two_pointer;

public class TargetSum {

    public static int[] getNumbersOfTarget(int [] arr,int target){
        int i=0,j=arr.length-1;
        while(i<j){
            if((arr[i]+arr[j])==target){
                return new int[]{arr[i], arr[j]};
            }else if((arr[i]+arr[j])<target){
                i++;
            }else if((arr[i]+arr[j])>target){
                j--;
            }
        }
        return null;
    }
    public static void main(String [] args){
        System.out.println("PROGRAM STARTED!");
        int[] arr = {1,2,3,5,7};
        int target = 3;
        int [] result = getNumbersOfTarget(arr,target);
        if(result == null){
            System.out.println("Target doesn't exist in the array!");
        }else{
            System.out.println("The numbers of target are "+result[0]+" AND "+result[1]);
        }
    }
}
