package org.example.concurency_practice;

import java.util.concurrent.Executor;

public class PracticeSet_2 implements Executor {


    @Override
    public void execute(Runnable command) {

        PracticeSet_1 hhkl=new PracticeSet_1();
        Thread gg=new Thread(hhkl);
        gg.start();
    }

    public static void main(String[] args) {
        PracticeSet_2 gg=new PracticeSet_2();
        gg.execute(new PracticeSet_1());


    }
}
