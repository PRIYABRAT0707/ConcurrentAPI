package org.example.concurrency_practice1;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class PracticeSet_1_countdownlatch {
    /*
    * coundowlatch is used to make sure that all thread are started which mention during initialization of
    * countdownlatch to run the main task
    *
    * e.g-we have 10 thread we declare it in initialization of coundownlatch if some one want to start a task which
    * uses all the 10 thread then coundownlatch helps us to make sure that all thread started succesfully by
    * countdownlatch.countdown method
    *
    * */

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch cdlk=new CountDownLatch(4);
        CrimeMasterGogoCoundownLatch w1=new CrimeMasterGogoCoundownLatch("ppanda1",cdlk,5000);
        CrimeMasterGogoCoundownLatch w2=new CrimeMasterGogoCoundownLatch("ppanda2",cdlk,5000);
        CrimeMasterGogoCoundownLatch w13=new CrimeMasterGogoCoundownLatch("ppanda3",cdlk,5000);
        CrimeMasterGogoCoundownLatch w4=new CrimeMasterGogoCoundownLatch("ppanda4",cdlk,5000);

        w1.start();
        w2.start();
        w13.start();
        w4.start();
        System.out.println(cdlk.getCount());
        cdlk.await(10000,TimeUnit.MILLISECONDS);
        System.out.println("main thread is "+Thread.currentThread().getName() +" starting");

    }
}
