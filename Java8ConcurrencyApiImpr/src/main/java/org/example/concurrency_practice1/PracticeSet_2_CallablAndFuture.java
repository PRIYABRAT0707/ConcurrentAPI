package org.example.concurrency_practice1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class PracticeSet_2_CallablAndFuture {

    /*
    * as runnable interface run method doesnt return a result we can get a result by implementing callable interface
    * future is used to store data which returned by callable object,its concrete class is futruretask
    * which implements both runnable and future interface
    * */
    public static void main(String[] args) throws ExecutionException, InterruptedException {


FutureTask[] fut1=new FutureTask[5];

    for(int i=0;i<5;i++){

        Callable cal =new FutureAndCallable();
        fut1[i]=new FutureTask(cal);
        Thread tt=new Thread(fut1[i]);
        tt.start();

    }
        for(int i=0;i<5;i++){
            System.out.println(fut1[i].get());
        }

    }
}
