package org.example.concurency_practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PracticeSet_3 {
    public static void main(String[] args) {
        ExecutorService ss= Executors.newFixedThreadPool(1);
        ss.execute(new PracticeSet_1());



    }
}
