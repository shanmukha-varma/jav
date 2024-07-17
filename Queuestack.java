import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queuestack {
    public static void main(String[] args) {
        Queue<Integer> pq=new LinkedList<>();
        Stack<Integer> pq1=new Stack<>();
        Collections.addAll(pq, 10,20,30,40,50);
        for(int i=0;i<5;i++){
            pq1.add(pq.element());
            pq.remove();
            //System.out.println(pq);
        }
        //System.out.println(pq1);
        for(int i=0;i<5;i++){
            pq.offer(pq1.pop());
        }
        System.out.println(pq);
    }
}
