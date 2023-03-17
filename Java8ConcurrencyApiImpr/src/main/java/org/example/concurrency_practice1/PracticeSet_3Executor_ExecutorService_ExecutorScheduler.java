package org.example.concurrency_practice1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class PracticeSet_3Executor_ExecutorService_ExecutorScheduler {
    /*
    * executor are used to create threadpool and can run multiple thread we have to implement its method
    * a threadpool is a management system which manages multiple thread
    * ExecutorService instance can be create via executors.threadpool which has method to  manage threadpool
    * ScheduledExeuctorService used to shdule threads in thread pool
    *
    * */
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Work wor=new Work("give me that message");

        ExecutorService es= Executors.newScheduledThreadPool(2);

FutureTask<String> saveme= (FutureTask<String>) es.submit(wor);
        System.out.println(saveme.get());
        es.shutdown();

    }
}
