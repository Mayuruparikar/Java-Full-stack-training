package com.training.training;
import java.util.LinkedList;
import java.util.Collections;

class linkedlist {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        System.out.println(list.getClass().getName());

        // adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // adding elements at specific positions
        list.addFirst("Mango");
        list.addLast("Orange");
        list.add(2, "Grapes");

        // updating elements
        list.set(1, "Pineapple");

        // getting elements
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // removing elements
        list.removeFirst();
        list.removeLast();
        list.remove(1);

        // traversing
        System.out.println("\nLinkedList elements:");
        for (String item : list) {
            System.out.println(item);
        }

        // sorting
        Collections.sort(list);
        System.out.println("\nAfter sorting: " + list);

        // checking size and containment
        System.out.println("Size: " + list.size());
        System.out.println("Contains Banana? " + list.contains("Banana"));
    }
}

/*
 * Notes:
 * LinkedList implements List, Deque, and Queue interfaces.
 * It is a **doubly linked list** internally (each node has data, next, and prev links).
 *
 *
 * add(), addFirst(), addLast(), remove(), removeFirst(), removeLast(), get(), set(), size(), contains()
 *
 *
 * Access by index: O(n)
 * Insertion/removal at start or middle: O(1) (if node reference known)
 * Iteration: O(n)
 *
 *
 * When you frequently add/remove elements at the beginning or middle.
 *
 *
 * No resizing array, but extra memory for node links.
 */
