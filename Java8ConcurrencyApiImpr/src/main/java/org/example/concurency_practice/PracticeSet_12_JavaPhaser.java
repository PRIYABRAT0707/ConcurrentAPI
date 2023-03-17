package org.example.concurency_practice;

import java.util.concurrent.Phaser;

public class PracticeSet_12_JavaPhaser implements Runnable {

    //phaser  helps us to wait a phase until another phase is completed
    //it is similar to cyclic barrier


    Phaser phaser;
    String title;

    public PracticeSet_12_JavaPhaser(Phaser phaser, String title)
    {
        this.phaser = phaser;
        this.title = title;

        phaser.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Thread: " + title
                + " Phase Zero Started");
        phaser.arriveAndAwaitAdvance();


        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread: " + title
                + " Phase One Started");
        phaser.arriveAndAwaitAdvance();


        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread: " + title
                + " Phase Two Started");
        phaser.arriveAndDeregister();
    }


    public static void main(String[] args) {
        Phaser phaser = new Phaser();
        phaser.register();
        int currentPhase;

        System.out.println("Starting");

        new PracticeSet_12_JavaPhaser(phaser, "A");
        new PracticeSet_12_JavaPhaser(phaser, "B");
        new PracticeSet_12_JavaPhaser(phaser, "C");


        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + currentPhase
                + " Complete");
        System.out.println("Phase Zero Ended");

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + currentPhase
                + " Complete");
        System.out.println("Phase One Ended");

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + currentPhase
                + " Complete");
        System.out.println("Phase Two Ended");


        phaser.arriveAndDeregister();
        if (phaser.isTerminated()) {
            System.out.println("Phaser is terminated");
        }
    }
}
