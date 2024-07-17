import java.util.*;
public class Str1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                char c=s.charAt(i-1);
                char j=s.charAt(i);
                //System.out.println(j+" "+c);
                Integer q=Integer.parseInt(String.valueOf(j));
                //c+=q;
                char cs=(char)((c-'a'+q)%26+'a');

                sb.append(cs);
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
