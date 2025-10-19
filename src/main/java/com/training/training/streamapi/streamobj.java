package com.training.training.streamapi;

import java.util.stream.Stream;

public class streamobj {
    public static void main(String[] args) {
        //stream api can work on the collections as well as the group of objects like arrays;

        //for creating blank stream
        Stream<Object>empstram=Stream.empty();
        empstram.forEach(e-> System.out.println(e));

        String[] arr ={"abc", "pqr","xyz"};
        Stream<String> arr1 = Stream.of(arr);
        arr1.forEach(e-> System.out.println(e));


    }
}
