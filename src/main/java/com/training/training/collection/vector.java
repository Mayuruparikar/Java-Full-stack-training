package com.training.training.collection;

import java.util.Vector;
import java.util.Collections;

class vector {
    public static void main(String[] args) {

        Vector<Integer> vec = new Vector<>();
        System.out.println(vec.getClass().getName());

        // adding elements
        vec.add(10);
        vec.add(20);
        vec.add(30);
        vec.addElement(40); // legacy method

        // inserting element at specific index
        vec.insertElementAt(15, 1);

        // updating elements
        vec.set(2, 25);

        // getting elements
        System.out.println("Element at index 0: " + vec.get(0));
        System.out.println("First element: " + vec.firstElement());
        System.out.println("Last element: " + vec.lastElement());

        // removing elements
        vec.remove(1);
        vec.removeElement(30);

        // traversing
        System.out.println("\nVector elements:");
        for (Integer num : vec) {
            System.out.println(num);
        }

        // sorting
        Collections.sort(vec);
        System.out.println("\nAfter sorting: " + vec);

        // checking size, capacity, and containment
        System.out.println("Size: " + vec.size());
        System.out.println("Capacity: " + vec.capacity());
        System.out.println("Contains 20? " + vec.contains(20));
    }
}

/*
 *
 * NOTES —
 *
 *  Vector implements List and is synchronized (threadsafe).
 *  Introduced in JDK 1.0, now considered legacy but still used in multithreading.
 *
 * add(), addElement(), insertElementAt(), remove(), removeElement(), get(), firstElement(), lastElement(), size(), capacity(), contains()
 *
 *  Slower than ArrayList due to synchronization.
 *  Doubles capacity when full (ArrayList increases by 50%).
 *
 *  When you need a threadsafe list.
 *
 *  Vector methods are synchronized.
 *  Has legacy methods like addElement(), removeElement(), etc.
 */
