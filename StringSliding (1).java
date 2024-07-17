import java.util.*;

public class StringSliding {
    public static void main(String[] args) {
        Set<String> s2=new HashSet<>();
        String s="aababcabc";
        int c=0;
        for(int i=0;i<s.length();i++){
            if(i+3<=9){
            String s1=s.substring(i, i+3);
            Collections.addAll(s2,s1);
            System.out.println(s2);
            if(s2.size()==3){
                c++;
            }
            s2.clear();
            }
        }
        System.out.println(s2);
        System.out.println(c);
    }
}
