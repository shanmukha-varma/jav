import java.util.*;
public class SlidingWindow {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int ar[]={1,1,0,1,1,1};
        int n=sc.nextInt();
        int max=0;
        for(int i=0;i<ar.length-n;i++){
            
            for(int j=1;j<n;j++)
            {
                if(ar[i+j]==1)
                max++;
                
            }
            System.out.print(max+" ");
            // a.remove(i);
            // //a.add(n+i);
            // System.out.println(a);
        }
        
    }
}
