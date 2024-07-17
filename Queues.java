import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

import javax.sound.midi.SysexMessage;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> pq=new PriorityQueue<>(4);
        ArrayList<Integer> pq1=new ArrayList<>();
        Collections.addAll(pq, 4,3,2,6);
        System.out.println(pq);
        int a=0;
        while(pq.size()>1){
        for(int i=0;i<2;i++){
            a+=Collections.min(pq);
            //System.out.println(a);
            pq.remove(Collections.min(pq));
        }
        System.out.println(a);
        pq1.add(a);
        System.out.println(pq1);
        pq.offer(a);
    }
    int sum=0;
    System.out.print(pq1);
    for(int i:pq1){
        sum+=i;
    }
    System.out.println(sum);
    }
}
