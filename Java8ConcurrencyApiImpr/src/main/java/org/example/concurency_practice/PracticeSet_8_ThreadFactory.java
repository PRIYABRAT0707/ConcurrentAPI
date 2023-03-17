package org.example.concurency_practice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadFactory;

public class PracticeSet_8_ThreadFactory implements ThreadFactory {
    //threadFactory is a interface which helps us create as many thread we want in a efficient manner

    public Thread newThread(Runnable r) {
        return new Thread(r);
    }

    public static void main(String[] args) {
        PracticeSet_8_ThreadFactory bb=new PracticeSet_8_ThreadFactory();
        Runnable run1=() -> System.out.println("printme 1");
        Runnable run2=() -> System.out.println("printme 2");
        Runnable run3=() -> System.out.println("printme 3");
        Runnable run4=() -> System.out.println("printme 4");
        Runnable run5=() -> System.out.println("printme 5");
        List<Runnable> ll= Arrays.asList(run1,run2,run3,run4,run5);
        for (Runnable run:ll){
            bb.newThread(run).start();
        }
    }
}
