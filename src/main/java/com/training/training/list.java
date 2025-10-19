package com.training.training;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

class list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.getClass().getName());

        // this is not our arraylist this is the private static class inside the Arrays
        // class
        // we cannot add or remove elements from this list
        // but we can update the elements
        List<String> l1 = Arrays.asList("a", "b", "c");
        // for making new list from existing list to make mutable
        List<String> l4 = new ArrayList<>(l1);

        System.out.println(l1.getClass().getName());
        String array[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        List l2 = Arrays.asList(array);

        List<String> l3 = List.of("x", "y", "z"); // immutable list

        // adding elements
        list.add(10);
        list.add(20);
        list.add(30);

        list.add(1, 15); // adding element at specific index

        list.set(2, 25); // updating element at specific index

        // for sorting
        Collections.sort(list);

        // for getting elements
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        // for size
        System.out.println(list.size());

        // for traversing arraylist
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // using for each loop
        for (Integer element : list) {
            System.out.println(element);
        }
        // for check the element is present or not
        System.out.println(list.contains(20));

        // for removing element
        list.remove(1);
        System.out.println(list);

        /*
         * note:
         * Unlike a regular array, which has a fixed size, an ArrayList
         * can grow and shrink as elements are added or removed. This
         * dynamic resizing is achieved by creating a new array when the
         * current array is full and copying the elements to the new array.
         *
         * Internally, the ArrayList is implemented as an array of Object references.
         * When you add elements to an ArrayList, you're essentially storing these
         * elements
         * in this internal array.
         *
         * When you create an ArrayList, it has an initial capacity (default is 10).
         * The capacity refers to the size of the internal array that can
         * hold elements before needing to resize.
         *
         * Adding Elements
         *
         * When we add an element to an ArrayList, the following steps occur
         *
         * Check Capacity: Before adding the new element, ArrayList checks if there is
         * enough space in the internal array (elementData). If the array is full, it
         * needs to be resized.
         *
         * Resize if Necessary: If the internal array is full, the ArrayList will
         * create a new array with a larger capacity (usually 1.5 times the current
         * capacity) and copy the elements from the old array to the new array.
         *
         * Add the Element: The new element is then added to the internal array at the
         * appropriate index,
         * and the size is incremented.
         *
         *
         * Removing Elements
         * Check Bounds: The ArrayList first checks if the index is within the valid
         * range.
         * Remove the Element: The element is removed, and all elements to the right of
         * the removed element are shifted one position to the left to fill the gap.
         * Reduce Size: The size is decremented by 1.
         */

        /*
         * Access by index (get) is O(1).
         * Adding an element is O(n) in the worst case when resizing occurs.
         * Removing elements can be O(n) because it may involve shifting elements.
         * Iteration is O(n).
         */
    }

}