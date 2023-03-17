package org.example.concurency_practice;

import java.util.concurrent.Semaphore;

public class PracticeSet_7_Semaphore {

    // semaphore are used to wait a thread until another thread completly used a resurce by permission system
    // via sem.acquire and sem.release

    public static void main(String[] args) throws InterruptedException {
        Semaphore bb=new Semaphore(1);
        PracticeSet_6_Semaphore1 gg=new PracticeSet_6_Semaphore1("A",bb);
        PracticeSet_6_Semaphore1 kk=new PracticeSet_6_Semaphore1("B",bb);
        gg.start();
        kk.start();
        gg.join();
        kk.join();

        System.out.println("resource remaining " +PracticeSet_5.counter);

    }
}
