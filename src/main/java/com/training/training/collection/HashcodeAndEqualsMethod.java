package com.training.training.collection;

import java.util.HashMap;

public class HashcodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Person, String> map=new HashMap<>();
        Person p1=new Person("Mayur",12);
        Person p2=new Person("Ram",18);
        Person p3=new Person("Mayur",12);
        //p1 and p3 have different hashcodes so they are stored in the different locations
        //because of new instance is created
        map.put(p1,"Engineer");
        map.put(p2,"Designer");
        map.put(p3,"Manager");
        //so, here hashmap will store all three key-value
        System.out.println(map);

        //but in this map2 we are hashvalues are same
        HashMap<Integer, String>map2=new HashMap<>();
        map2.put(1,"Dev");
        map2.put(2,"Amit");
        map2.put(1,"Raj");
        System.out.println(map2);
        System.out.println(map2);




    }
}
class Person{
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Person (String name,int id)
    {
        this.name=name;
        this.id=id;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}