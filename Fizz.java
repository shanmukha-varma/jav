import java.util.*;
public class Fizz {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        for(int i=1;i<16;i++){
            if(i%3==0&&i%5==0){
                al.add("FizzBuzz");
            }
            else if(i%3==0&&i%5!=0){
                al.add("Fizz");

            }
            else if(i%5==0&&i%3!=0){
                al.add("Buzz");
            }
            else{
                String a=String.valueOf(i);
                al.add(a);
            }
        }
        System.out.println(al);
    }
}
