package com.training.training.ref;
import java.util.List;
import java.util.stream.Stream;

//practical use of the referencing
public class streamMain {
    public static void main(String[] args) {
       List <Integer> l1= List.of(121,121,244,2455);
        System.out.println(l1);

        l1.stream().forEach(System.out::println);

    }
}
