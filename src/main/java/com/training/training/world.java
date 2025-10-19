package com.training.training;

public class world extends Thread{

    public void run()
    {

        System.out.println("Running");

        try {
            Thread.sleep(2000);

            Thread.yield();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        for(int i=0; i<100; i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
