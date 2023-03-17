package org.example.concurrency_practice1;

import java.util.concurrent.CountDownLatch;

public class CrimeMasterGogoCoundownLatch extends Thread{
    public CountDownLatch cdl;
    public int delay;

    public CrimeMasterGogoCoundownLatch(String name, CountDownLatch cdl, int delay){
        super(name);
        this.delay=delay;
        this.cdl=cdl;
    }
    @Override
    public void run(){

        try {
            Thread.sleep(delay);
            cdl.getCount();
            System.out.println("current thread is " +Thread.currentThread().getName() +" has been finished");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
