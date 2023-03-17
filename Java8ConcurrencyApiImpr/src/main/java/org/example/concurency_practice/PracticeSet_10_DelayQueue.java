package org.example.concurency_practice;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class PracticeSet_10_DelayQueue implements Delayed {
int id;
String name;
long time;
    PracticeSet_10_DelayQueue(int id, String name, long time){
        this.id=id;
        this.name=name;
        this.time=System.currentTimeMillis()+time;
    }
    @Override
    public long getDelay(TimeUnit unit) {
        long diff = time - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public String toString() {
        return "PracticeSet_10{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time=" + time +
                '}';
    }

    @Override
    public int compareTo(Delayed o) {
        if(this.time<((PracticeSet_10_DelayQueue)o).time){
            return 1;
        }
       else if(this.time>((PracticeSet_10_DelayQueue)o).time){
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        BlockingQueue<PracticeSet_10_DelayQueue> DQ
                = new DelayQueue<PracticeSet_10_DelayQueue>();
        DQ.add(new PracticeSet_10_DelayQueue(10,"ppanda",100));
        DQ.add(new PracticeSet_10_DelayQueue(10,"ppanda",200));
        DQ.add(new PracticeSet_10_DelayQueue(10,"ppanda",1300));
        DQ.add(new PracticeSet_10_DelayQueue(10,"ppanda",5666));
        DQ.forEach((x)-> System.out.println(x));
    }



}
