package org.example.concurency_practice;

import java.util.concurrent.Semaphore;

public class PracticeSet_6_Semaphore1 extends Thread implements Runnable {

String tname;
Semaphore sem;
    PracticeSet_6_Semaphore1(String tname,
                             Semaphore sem){
        super(tname);
        this.tname=tname;
        this.sem=sem;
    }

    @Override
    public void run() {


            if (this.getName().equals("A")) {
                try {
                System.out.println("strating " + tname);

                System.out.println(tname + " waiting for permit");
                sem.acquire();
                System.out.println("permission accuired by "+tname);
                for(int i=0; i < 5; i++)
                {
                    PracticeSet_5.counter++;
                    System.out.println(tname + ": " + PracticeSet_5.counter);

                    Thread.sleep(5000);
                }
            } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("releasing the thread " +tname);
                sem.release();
            }
            else {
                System.out.println("Starting " + tname);
                try
                {
                    System.out.println(tname + " is waiting for a permit.");

                    sem.acquire();

                    System.out.println(tname + " gets a permit to perform.");


                    for(int i=0; i < 5; i++)
                    {
                        PracticeSet_5.counter--;
                        System.out.println(tname + ": " + PracticeSet_5.counter);


                        Thread.sleep(5000);
                    }
                } catch (InterruptedException exc) {
                    System.out.println(exc);
                }
                System.out.println(tname + " releases the permit.");
                sem.release();
            }



    }
}
