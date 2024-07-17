import java.util.Scanner;

class Arr{
    public static void main(String[] args) {
        //System.out.println("Hello");
        Scanner sc=new Scanner(System.in);
        int [][] a=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
            a[i][j]=sc.nextInt();
        }
        int c=0,max=0,b=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(a[i][j]==1)
                c++;
                else
                continue;
            }
            if(max<c){
            max=c;
            c=0;
            b=i;}
            

        }
            System.out.println("count"+b);
            sc.close();
    }
}