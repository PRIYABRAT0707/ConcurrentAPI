package org.example.concurency_practice;

import java.util.concurrent.Executor;

public class PracticeSet_1 implements Runnable  {



    public void giveMe(){
        for(int i=0;i<3;i++){
        System.out.println("printme 2 times");}
    }

    public void giveMeThat(){
        for(int i=0;i<3;i++){
            System.out.println("printme 3 times");}
    }
    public static void main(String[] args) throws InterruptedException {
        PracticeSet_1 hhk=new PracticeSet_1();
        PracticeSet_1 hhk1=new PracticeSet_1();
        Thread tt=new Thread(hhk);
        Thread tt1=new Thread(hhk1);
        tt.start();
        System.out.println(tt.getName());
        tt1.start();
        System.out.println(tt1.getName());
        tt1.join(6000);


    }

    @Override
    public void run() {
        PracticeSet_1 hh=new PracticeSet_1();
        hh.giveMe();
        hh.giveMeThat();
    }
}
