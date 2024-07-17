public class Stra {
    public static void main(String[] args) {
        String s="CapiTALIZE_tHe_tiTlE";
        String s1=s.toLowerCase();
        System.out.println(s1);
        StringBuffer sb=new StringBuffer();
        String s2[]=s1.split("_");
        for(String a:s2){
            String b=a.substring(0,1).toUpperCase();
            sb.append(b);
            sb.append(a.substring(1));
            sb.append(" ");
        }
        for(int i=0;i<s1.length();i++){
            if(Character.isLetterOrDigit(s1.charAt(i))){
                sb.append(s1.charAt(i));
            }
        }
        System.out.println(sb);
        s1=sb.toString();
        int low=0,high=s1.length()-1;
        while(low<high){
            if(s1.charAt(high)==s1.charAt(low)){
                high--;
                low++;
            }
            else{
                System.out.println("Not a palindrome");
                System.exit(0);
            }
        }
        System.out.println("Palindrome");
    }
}
