package com.training.training.lambda;



public class Main {
    public static void main(String[] args) {
//        MyInterImpl my=new MyInterImpl();
//        my.SayHii();

        // also
//        MyInter my=new MyInterImpl();
//        my.SayHii();

        // here we are not making the object of the interface but just making
//        // the object of the child class which is anonymous
//        MyInter i=new MyInter() {
//
//            @Override
//            public void SayHii() {
//                System.out.println("This is first anomoymous class");
//            }
//        };
//        i.SayHii();
//
//        MyInter i2=new MyInter() {
//            @Override
//            public void SayHii() {
//                System.out.println("This is second anomoymous class");
//            }
//        };
//        i2.SayHii();


        //using lambda
        //lambda only used for the functional interface.
        MyInter i=()-> System.out.println("This is the first lambda use");
        i.SayHii();
        MyInter i2=()-> System.out.println("This is the second lambda use");
        i2.SayHii();

        SumInter si=(a,b)-> a+b;
        System.out.println(si.sum(4,6));
        System.out.println(si.sum(91,6));

        LengthInter lg=s->s.length();
        System.out.println(lg.getLength("Mayur"));
    }
}
