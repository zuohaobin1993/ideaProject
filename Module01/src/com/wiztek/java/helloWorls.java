package com.wiztek.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class helloWorls {
    public static void main(String[] args) {

        List<String> list =new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("2");
        System.out.println(list.stream().distinct().collect(Collectors.toList()));

        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j))){
                    System.out.println("第"+(i+1)+"个元素"+list.get(i)+"重复");
                }

            }

        }
        System.out.println("V2.0");

        System.out.println("V3.0");

        System.out.println("合并");

        System.out.println("111111111111");

        System.out.println("22222222222222");
    }
}
