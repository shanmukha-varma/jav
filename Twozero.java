import java.util.*;
public class Twozero {
    public static void main(String[] args) {
        int a[]={0,1,0,3,2,1};
        int i=0,j=5;
        while(i<=j){
            if(a[i]==0&&a[j]!=0){
                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
                i++;
                j--;
            }
            else if(a[j]==0)
            j--;
            else if(a[i]!=0)
            i++;
        }
        for(i=0;i<6;i++)
        System.out.print(a[i]+" ");
    }
}
