package org.example.concurency_practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class PracticeSet_9_BlockingQueue {

    //blockingQue practice
//blockingque is a interface which doenst allow any null value and insert a value if any space is there and
    //drop a value if tharea is a value is present oytherwise throw an error

    public static void main(String[] args) throws InterruptedException {
        BlockingDeque<Integer> bq=new LinkedBlockingDeque<>(5);

        bq.addAll(new LinkedList<>(Arrays.asList(10,60,70,80,90)));
        bq.forEach((x)-> System.out.println(x));
        bq.removeLast();
        bq.put(78);
        System.out.println("----------------------------------");
        bq.forEach((x)-> System.out.println(x));

    }
}
