import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArOd {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        Collections.addAll(al, 1,2,34,3,4,5,7,23,12);
        int c=0;
        for(int i:al){
            if(i%2!=0){
                c++;
                al2.add(i);
                if(c==3)
                System.out.println(al2);
            }
            else if(i%2==0){
                c=0;
                al2.clear();
            }
    
        }
        //System.out.println(al2);
    }
}
