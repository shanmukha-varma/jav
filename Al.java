import java.util.*;

public class Al {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={9,2,3,8,10};
        Arrays.sort(a);
        int a1=a[0];
        int a2=a[4];
        int gcd=0;
        for(int i=1;i<a2/2;i++){
            if(a2%i==0&&a1%i==0){
                gcd=i;
            }
        }
        System.out.println("GCd: "+gcd);
        sc.close();
    }
}
