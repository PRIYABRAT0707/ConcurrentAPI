package org.example.concurency_practice;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class PracticeSet_13_CyclicBarrier  implements Runnable{
    /*
     * CyclicBarrier are used to combine output of all thread and supply to main thred
     *
     * e.g-suppose we have 3 thread running simultaneously and 1st thread complete its process and give a output
     * which we can store in a callable datatype,cyclic barrier hold that output and wait for other thread
     * complete their respective process and combine all output and supply to main thread
     * where we can use a future datatype to store the final value
     *
     * implementing cyclicbarrier
     *
     * */

    public static CyclicBarrier lop=new CyclicBarrier(3);
    @Override
    public void run() {
        System.out.println("number of parties required to trip the barrier " + PracticeSet_13_CyclicBarrier.lop.getParties());
        System.out.println("product of output" +(CyclicBarrier1.product*CyclicBarrier2.sum));

        CyclicBarrier1 cb=new CyclicBarrier1();
        CyclicBarrier2 cbk=new CyclicBarrier2();
        Thread t1=new Thread(cb);
        Thread t2=new Thread(cbk);
        t1.start();
        t2.start();
        try {
            PracticeSet_13_CyclicBarrier.lop.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }

        System.out.println("product of the output is " + +(CyclicBarrier1.product*CyclicBarrier2.sum));

        lop.reset();
        System.out.println("barrier reset successful");
    }

    public static void main(String[] args) {
        PracticeSet_13_CyclicBarrier bb=new PracticeSet_13_CyclicBarrier();
        Thread t3=new Thread(bb);
        t3.start();


    }




}
