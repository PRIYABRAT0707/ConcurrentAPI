package org.example.concurrency_practice1;

import java.util.concurrent.Callable;

public class Work implements Callable<String> {
    public String mes ;

    @Override
    public String toString() {
        return "Work{" +
                "mes='" + mes + '\'' +
                '}';
    }

    public Work(String mes){
         this.mes=mes;
     }
    @Override
    public String call() throws Exception {
        return "return  " +mes ;
    }
}
