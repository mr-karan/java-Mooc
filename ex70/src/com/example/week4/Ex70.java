package com.example.week4;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by karan on 9/8/15.
 */
public class Ex70 {
    public static List<Integer> combine(List<Integer> one, List<Integer> two){
      List<Integer> lfinal= new ArrayList<Integer>();
        lfinal.addAll(one);
        lfinal.addAll(two);
        return lfinal;
    }

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list3 = new ArrayList<Integer>();
        list1.add(5);
        list2.add(6);
        list1.add(10);
        list2.add(5);
        list1.addAll(list2);
        //System.out.println(list1);
        System.out.println(combine(list1, list2));



    }
}
