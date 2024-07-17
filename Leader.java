import java.util.*;
public class Leader {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int l=sc.nextInt();
       int[] a= new int[l];
       int[] b=new int[l]; 
       for(int i=0;i<l;i++){
        a[i]=sc.nextInt();
       }
       boolean k=true;
       while(k){
       for(int i=0;i<l;i++){
        if(a[i]<a[i+1]){
            b[i]=a[i+1];
       }
        break;
        }
        //b[i]=a[i+1];
      // }
       break;
    }
       for(int i=0;i<l;i++){
        System.out.println(b[i]);
       }

    }
    
}
