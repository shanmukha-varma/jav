import java.util.*;
public class F {
    public static void main(String[] args) {
        int a[]={1,5,8,10,13,16,27,32,45,60};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int i=0,j=9,c=0;
        while(i<j){
            if(a[i]+a[j]==target){
                //System.out.println(i+" "+j);
                //break;
                i++;
                j--;
            }
            else if(a[i]+a[j]<target){
                i++;
                c++;
            }
            else{
                j--;
            }
        }
        System.out.println(c);
        sc.close();
    }
}
