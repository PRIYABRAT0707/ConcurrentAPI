package org.example.concurency_practice;

import java.util.Calendar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PracticeSet_4{
    //thread scheduler
    public void dontRetutnAnything(){
        ScheduledExecutorService ssd= Executors.newScheduledThreadPool(10);
        System.out.println("clock countdown");
        System.out.println(Calendar.getInstance().get(Calendar.SECOND));
        for (int i = 10; i >= 0; i--) {
            ssd.schedule(new PracticeSet_1(),10-i, TimeUnit.MINUTES);

        }

    }

    public static void main(String[] args) {
        PracticeSet_4 jj=new PracticeSet_4();
        jj.dontRetutnAnything();
    }
}
