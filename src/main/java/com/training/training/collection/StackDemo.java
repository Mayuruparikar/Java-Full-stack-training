package com.training.training.collection;

import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer>mystack=new Stack<>();
        mystack.push(1);
        mystack.push(2);
        mystack.push(3);
        mystack.push(4);
        mystack.push(5);
        mystack.push(6);
        mystack.push(7);
        System.out.println(mystack);

        mystack.pop();
        System.out.println(mystack);
        System.out.println(mystack.peek());

        System.out.println(mystack.isEmpty());
        System.out.println(mystack.size());


        //we can also use the linkedlist as stack by manupulating with the last index
        LinkedList<Integer>ll=new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.removeLast();
        ll.getLast();

    }
}
