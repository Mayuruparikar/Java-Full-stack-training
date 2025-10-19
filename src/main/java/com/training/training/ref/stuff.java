package com.training.training.ref;

public class stuff {
    public static void doStuff()
    {
        System.out.println("I am doing stuff");
    }
    //static method
    public static void threadTask() {
        for (int i = 1; i < 10; i++) {
            System.out.println(i * 2);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    //non static method
        public void primeNum() {
        for (int i = 1; i < 10; i++)
        {
            System.out.println(i);

            try
            {
                Thread.sleep(2000);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }



    }
}
