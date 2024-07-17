import java.util.*;
public class Arraty {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        Collections.addAll(al, 9,2,3,8);
        for(int i:al){
            Collections.addAll(al,i);
            //System.out.println(al);
        }
        Collections.addAll(al);
        System.out.println(al);
    }
}
