package org.example.thradingpractice;

import java.time.Duration;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadPracticeSet_9 implements Runnable {

    public void met1(){
        System.out.println("printing 1 times " );
    }
    public void met2(){
        System.out.println("printing 2 times " );
    }
    public void met3(){
        System.out.println("printing 3 times ");
    }
    public void met4(){
        System.out.println("printing 4 times ");
    }
    public void met5(){
        System.out.println("printing 5 times ");
    }

    @Override
    public void run() {
        Lock lok=new ReentrantLock();
        Phaser pp=new Phaser();
        pp.register();
        ThreadPracticeSet_9 hh=new ThreadPracticeSet_9();
        try {
            lok.lock();
            hh.met1();
            hh.met2();
            hh.met3();
            hh.met4();
            hh.met5();
            int i=pp.arriveAndAwaitAdvance();
            System.out.println(i);

        }
        catch( Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("running smoothly " +Thread.currentThread().getName()+ " ended successfully") ;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadPracticeSet_9 mm=new ThreadPracticeSet_9();
        ThreadPracticeSet_9 mm1=new ThreadPracticeSet_9();
        ThreadPracticeSet_9 mm2=new ThreadPracticeSet_9();
        ThreadPracticeSet_9 mm4=new ThreadPracticeSet_9();
        ThreadPracticeSet_9 mm5=new ThreadPracticeSet_9();
        ThreadPracticeSet_9 mm6=new ThreadPracticeSet_9();
        Thread t1=new Thread(mm);
        Thread t2=new Thread(mm1);
        Thread t4=new Thread(mm4);
        Thread t5=new Thread(mm5);
        Thread t3=new Thread(mm2);
        Thread t6=new Thread(mm6);

        t1.start();
        Thread.sleep(Duration.ofSeconds(10));
        t2.start();
        Thread.sleep(Duration.ofSeconds(15));
        t3.start();

        System.out.println("---------------------------");

        Thread.sleep(Duration.ofSeconds(15));
        t4.start();
        Thread.sleep(Duration.ofSeconds(15));
        t5.start();
        Thread.sleep(Duration.ofSeconds(15));
        t6.start();



    }
}
