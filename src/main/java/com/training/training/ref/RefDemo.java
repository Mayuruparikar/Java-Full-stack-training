package com.training.training.ref;

public class RefDemo {
    public static void main(String[] args) {
        //as it is the static method dostuff,we can refer body  using class
        //class::method;
        WorkInter workInter=stuff::doStuff;
        //means dostuff body comes in the doTask

        workInter.doTask();
        Runnable runnable=stuff::threadTask;
        Thread t=new Thread(runnable);
        t.start();

        //referring method body of the non static method, we need to create the object
        stuff st1=new stuff();
        Runnable r1=st1::primeNum;
        Thread t2=new Thread(r1);
        t2.start();



    }
}
