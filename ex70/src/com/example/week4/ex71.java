package com.example.week4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by karan on 9/8/15.
 */
public class ex71 {
    public static List<Integer> smartcombine(List<Integer> one, List<Integer> two){
       for(int element:two){
           if(one.contains(element)){
               continue;
           }
           else{
               one.add(element);
           }
       }
        return one;
    }

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        list1.add(4);
        list1.add(3);

        list2.add(3);
        list2.add(10);
        list2.add(7);

        smartcombine(list1, list2);

        System.out.println(list1); // prints [4, 3, 10, 7] (smart combine)

        System.out.println(list2); // prints [3, 10, 7]





    }
}
