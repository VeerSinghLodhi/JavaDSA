package org.example.two_pointer;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

    public static int countOfUniqueElements(List<Integer>arr){
        int cm=1,uniqueElement=1;
        while(cm<arr.size()){
            if(arr.get(cm)==arr.get(cm-1)){
                cm++;
                continue;
            }
            cm++;
            uniqueElement++;
        }
        return uniqueElement;
    }

    public static List<Integer> removeDuplicates(List<Integer>arr){
        int officer=0,cm=1;
        List<Integer>uniqueArray=new ArrayList<>();
        uniqueArray.add(arr.get(officer));
        while(cm<arr.size()){
            if(arr.get(cm)==arr.get(cm-1)){
                cm++;
                continue;
            }
            uniqueArray.add(arr.get(cm));
            cm++;
        }
        return uniqueArray;
    }
    public static void main(String [] args){
        List<Integer>arr=List.of(1,1,1,2,2,3,3,4,4,5,5,6);
        int uniqueElementCount = countOfUniqueElements(arr);
        System.out.println("The number of unique element is "+uniqueElementCount);
        List<Integer>uniqueArray=removeDuplicates(arr);
        for(int num : uniqueArray){
            System.out.print(num+", ");
        }
    }
}
