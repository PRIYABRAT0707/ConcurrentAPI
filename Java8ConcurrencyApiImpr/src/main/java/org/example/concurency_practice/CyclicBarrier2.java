package org.example.concurency_practice;

import java.sql.SQLOutput;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CyclicBarrier2 implements Runnable{
    public static int sum=0;
    @Override
    public void run() {
        System.out.println("is the barrier broken "+ PracticeSet_13_CyclicBarrier.lop.isBroken());
        sum=90+100;
        try {
            PracticeSet_13_CyclicBarrier.lop.await(5000, TimeUnit.MICROSECONDS);
            System.out.println("number of parties waitaing at barrier " + PracticeSet_13_CyclicBarrier.lop.getNumberWaiting());
        } catch (InterruptedException | BrokenBarrierException | TimeoutException e) {
            throw new RuntimeException(e);
        }

    }
}
