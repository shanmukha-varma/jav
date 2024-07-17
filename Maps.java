import java.util.HashMap;
import java.util.Map;

public class Maps {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Map<String,Integer> m=new HashMap<>(); 
        m.put("a", 10);
        m.put("b", 20);
        m.put("c", 30);
        m.put("d", 40);
        m.put("e", 50);
        //System.out.println(m);
        m.getOrDefault("a",20);
        // for(char i='a';i<='e';i++){
        //     System.out.println(m.get(i));
        // }
        System.out.println(m);
    }
}
