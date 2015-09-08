package com.example.week4;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by karan on 9/8/15.
 */
public class Ex70 {
    public static List<Integer> combine(List<Integer> one, List<Integer> two){
        one.addAll(two);
        return one;
    }

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        list1.add(4);
        list1.add(5);

        list2.add(3);
        list2.add(10);
        list2.add(7);

        combine(list1, list2);

        System.out.println(list1); // prints [4, 3, 5, 10, 7]

        System.out.println(list2); // prints [5, 10, 7]





    }
}
