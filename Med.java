
import java.util.Scanner;

public class Med {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
            a[i][j]=sc.nextInt();
        }
        int k=0;
        int b[]=new int[9];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                //while(k<9){
                    b[k]=a[i][j];
                    k++;
                    //break;
                
            }
        }
        for(int i=0;i<9;i++){
            System.out.print(b[i]+" ");
            
        }
        System.out.println();
        int med=9/2;
        System.out.println(b[med]);
    sc.close();}
}