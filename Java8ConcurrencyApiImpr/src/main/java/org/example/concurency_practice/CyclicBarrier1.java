package org.example.concurency_practice;

import java.util.concurrent.BrokenBarrierException;

public class CyclicBarrier1 implements Runnable{
    public static int product=0;
    @Override
    public void run() {
        product=10*30;

        try {
            PracticeSet_13_CyclicBarrier.lop.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }


    }
}
