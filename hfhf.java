import java.util.*;
public class hfhf {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        Map<Integer,Integer> m=new TreeMap<>();
        Collections.addAll(a, 1,2,-1,3,2);
        for(int i:a){
            int b=i;
            int c=0;
            for(int j:a){
                if(j==b)
                c++;
            }
            if(m.containsKey(i))
            continue;
            else
            m.put(i,c);
        }
        System.out.println(m);
        for(Map.Entry<Integer,Integer> entry:m.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
