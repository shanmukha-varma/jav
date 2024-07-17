import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class A {
    public static void main(String[] args) {
        Queue<Integer> pq1=new PriorityQueue<>();
        Collections.addAll(pq1, 1,2,3,4,5);
        int m=1;
        for(int i=0;i<=pq1.size()-1;i++){
            if(i==0||i==1)
            System.out.println(-1);
            else{
                int n=pq1.remove();
                m*=n;
            }
        }
    }
}
