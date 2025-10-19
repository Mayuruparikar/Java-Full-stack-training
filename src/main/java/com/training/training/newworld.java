package com.training.training;

public class newworld implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName());

        }


    }
}
