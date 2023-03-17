package org.example.concurrency_practice1;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.random.RandomGenerator;

public class FutureAndCallable implements Callable {
    @Override
    public Object call() throws Exception {

        Random rd=new Random();
        Integer rand=rd.nextInt(5,70);

        return rand;
    }
}
