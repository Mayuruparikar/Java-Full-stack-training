package com.training.training;

public class Counter {
    int count=0;
    //synchronized: makes that only a thread at a time should access this method.
    public synchronized void increment()
    {
        count++;
    }
}
