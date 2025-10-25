package com.training.training.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String>hm=new LinkedHashMap<>(11,0.3f,true);
        hm.put(1,"Mayur");
        hm.put(2,"Gopal");
        hm.put(3,"Suresh");
        hm.get(1);
        for(Map.Entry<Integer, String> entry:hm.entrySet())
        {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

    HashMap<String, Integer>hm1=new HashMap<>();
        LinkedHashMap lhm=new LinkedHashMap(hm1);
        hm1.put("Anubhav", 99);
        hm1.put("Radhe", 98);
        hm1.put("Elon", 97);
        Integer res=hm1.getOrDefault("Elon",0);
        System.out.println(res);
        hm1.putIfAbsent("Shubham",92);
        System.out.println(hm1);


    }
}
