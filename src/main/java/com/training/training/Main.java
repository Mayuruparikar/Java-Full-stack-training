package com.training.training;

public class Main {


        public static void main(String[] args) throws InterruptedException {
            System.out.println("Hello");

            //Thread LifeCycle
            //NEW
            world w = new world();
            System.out.println(w.getState());

            //RUNNABLE
            w.start();
            System.out.println(w.getState());

            Thread.sleep(5000);
            //Timed-waiting
            System.out.println(w.getState());

            // Terminated
            w.join();
            System.out.println(w.getState());



            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName());
            }

            //Runnable interface
            newworld nw = new newworld();
            Thread t1 = new Thread(nw);

            t1.setDaemon(true);
            t1.start();

            //thread methods
            myThread t2=new myThread();
            t2.start();


            //Thread Priority
            t2.setPriority(Thread.MAX_PRIORITY);
            t1.setPriority(Thread.MIN_PRIORITY);


            //imp methods of thread
            //Thread.sleep();
            //Thread.start();
            //Thread.join();
            // thread.setpriotity(Thread.priority);
            //thread.interrupted();
            // thread.setDemon();
            //thread.yield

        }




}
