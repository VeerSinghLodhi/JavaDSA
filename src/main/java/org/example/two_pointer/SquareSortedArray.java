package org.example.two_pointer;

import java.util.ArrayList;
import java.util.List;

public class SquareSortedArray {

    public static List<Integer>getSquareSortedList(List<Integer>list){
        int i,j;
        List<Integer>pos=new ArrayList<>();
        List<Integer>neg=new ArrayList<>();
        for(i=0;i<list.size();i++){
            if(list.get(i)<0){
                neg.add(list.get(i));
            }else{
                pos.add(list.get(i));
            }
        }
        for(i=0;i<pos.size();i++){
            pos.set(i,pos.get(i)*pos.get(i));
        }
        for(i=0;i<neg.size();i++){
            neg.set(i,neg.get(i)*neg.get(i));
        }
        neg=neg.reversed();
        // if array has only positive values.
        if(neg.size()==0){
            return pos;
        }
        // if array has only negative values
        if(pos.size()==0){
            return neg;
        }

        // if array both types of values positive and negative.
        List<Integer>result=new ArrayList<>();
        i=0;j=0;
        while(i<pos.size() && j<neg.size()){
            if(pos.get(i)<neg.get(j))
                result.add(pos.get(i++));
            else
                result.add(neg.get(j++));
        }
        while(i<pos.size()){
            result.add(pos.get(i++));
        }
        while(j<neg.size()){
            result.add(neg.get(j++));
        }
        return result;
    }


    public static void main(String args[]){
        System.out.println("Program started!");
        List<Integer>arr= List.of(-4,-3,-2,0,1,2,3,4);
        List<Integer>squareSortedList=getSquareSortedList(arr);
        System.out.println(squareSortedList);
    }
}
