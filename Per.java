public class Per {
    public static void main(String[] args) {
        String s="       helloooo     world         ";
        //System.out.println(s.trim());
        String s1=s.trim();
        //String s2="";
        /*for(int i=s1.length()-1;i>=0;i--){
            //System.out.print(s1.charAt(i));

        }*/
        
        String [] words=s1.split(" ");
        for(int i=words.length-1;i>=0;i--)
        System.out.print(words[i]+" ");
    }
}
