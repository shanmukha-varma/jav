import java.util.*;
public class Arra1 {
    public static void main(String[] args) {
        int a[]={1,1,4,2,1,3};
        int b[]={1,1,4,2,1,3};
        Arrays.sort(b);
        int c=0;
        for(int i=0;i<6;i++){
            if(a[i]!=b[i]){
                c++;
            }
        }
        System.out.println("Co: "+c);
    }
}
