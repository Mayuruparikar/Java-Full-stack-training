package com.training.training.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapdemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"mayur");
        map.put(2,"lion");
        System.out.println(map);

        //for getting the value of the perticular key
        System.out.println(map.get(1));
        System.out.println(map.get(81));

        //checking the key is present or not
        System.out.println(map.containsKey(83));

        //for checking the value is present or not
        System.out.println(map.containsValue("mayur"));

        Set<Integer>keys=map.keySet();
        for(int i:keys)
        {
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> entry: entries)
        {
            System.out.println(entry.getKey()+":"+entry.getValue());
            entry.setValue(entry.getValue().toUpperCase());
        }
        map.remove(1);
        System.out.println(map);
    }
}
