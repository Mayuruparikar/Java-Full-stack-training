package com.training.training.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        //create a list and filter all the even number from the list
       List <Integer>l1= List.of(1,2,3,4,5,66,7);

       List<Integer> evenlist=new ArrayList<>();
       for(Integer i:l1)
       {
           if(i%2==0)
           {
               evenlist.add(i);
           }
       }
        System.out.println(l1);
        System.out.println(evenlist);

        //using stream
        Stream<Integer> stream=l1.stream();
        List<Integer> newlist=stream.filter( i->i%2==0).collect(Collectors.toList());
        System.out.println(newlist);

        List<Integer> newlist2=l1.stream().filter(i->i%2==0).collect(Collectors.toList());

        List<Integer> newlist3=l1.stream().filter(i->i>50).toList();
        System.out.println(newlist3);






    }
}

