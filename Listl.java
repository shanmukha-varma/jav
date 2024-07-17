import java.util.ArrayList;
import java.util.Collections;

public class Listl {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> arr1=new ArrayList<>();
        Collections.addAll(arr, 1,2,3,4,1);
        for(int i:arr){
            if(arr1.contains(i)){
                continue;
            }
            else{
                arr1.add(i);
            }
        }
        if(arr.size()==arr1.size()){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
