package com.training.training.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {

//        filter(predicate)
//        predicate: its a boolean valued function
//        and filters the objects or the elements or objects based on the returnned boolean value

//        map(function)
//        not filters perform the operation or function on the each value of the collection
//       functions-> returns the value

        List<String> names= List.of("Mayur","Bhushan","Tushar","Roshan","Maya","Ravi");
        List <String>newNames=names.stream().filter(e->e.startsWith("M") ||e.startsWith("R")).toList();
        System.out.println(newNames);

        List<Integer>num=List.of(23,4,67,3);
        List<Integer>nm=num.stream().map(i->i*i).toList();
        System.out.println(nm);

        //forEach
        names.stream().forEach(e-> {System.out.println(e); });

        num.stream().forEach(System.out::println);


    //sorted
        num.stream().sorted().forEach(e-> System.out.println(e));

        //min
        Integer integer=num.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println(integer);

        //MAx
        Integer maxinteger=num.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(maxinteger);
    }
}
