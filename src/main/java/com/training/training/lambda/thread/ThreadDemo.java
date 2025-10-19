package com.training.training.lambda.thread;

public class ThreadDemo {
    public static void main(String[] args) {
        // first thread -> with name john
        //for making thread using lambda exp we are just using Runnable interface here

        Runnable t1=()->{
            // body of thread
            try {
                for(int i=0; i<10; i++)
                {
                    System.out.println(i);
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread=new Thread(t1);
        thread.setName("JOHN");
        thread.start();
        System.out.println(Thread.currentThread().getName());

        Runnable t2=()->{
            try{
                for(int i=1; i<=10; i++)
                {
                    System.out.println(i*2);
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread thread2=new Thread(t2);
        thread2.start();

    }
}
