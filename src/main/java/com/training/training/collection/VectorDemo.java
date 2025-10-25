package com.training.training.collection;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector <Integer>vc=new Vector<>(4,3);

        vc.add(1);
        vc.add(2);
        vc.add(3);
        vc.add(4);
        System.out.println(vc.capacity());
        vc.add(5);
        System.out.println(vc.capacity());
        vc.add(6);

        Vector<Integer>vc1=new Vector<>();

    }
}
