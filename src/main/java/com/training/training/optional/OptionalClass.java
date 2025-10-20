package com.training.training.optional;

import java.util.Optional;

public class OptionalClass {
    public static Optional<String> getName()
    {
     String name="Mayur";
     return Optional.ofNullable(name);

    }


    public static void main(String[] args) {
        String str=null;
        if(str==null)
        {
            System.out.println("string is null");
        }
        else{
            System.out.println(str+"with length"+str.length());

        }

        Optional<String> optional = Optional.ofNullable(str);
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());
//        System.out.println(optional.get());
        System.out.println(optional.orElse("String is empty"));

         Optional <String> name=getName();
        System.out.println(name.orElse("name is empty"));

    }
}

