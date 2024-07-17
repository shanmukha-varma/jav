import java.util.*;
public class Mapsc {
    public static void main(String[] args) {
        Map<Integer,Integer> m=new HashMap<>();
        int a[]={2,2,1,2,2,3,3,3,3,3,3,3};
        Arrays.sort(a);
        System.out.println(a[(a.length)/2]);
    }
}
