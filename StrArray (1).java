import java.util.*;
public class StrArray {
    public static void main(String[] args) {
        String s[]={"abc","bcb","ccc","aaa"};
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<s.length;i++){
            if(s[i].contains("a")){
                a.add(i);
            }
        }
        System.out.println(a);
    }
}
