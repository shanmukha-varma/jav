import java.util.*;
class Arra{
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Double> arr1=new ArrayList<>();
        //int size;
        Scanner sc=new Scanner(System.in);
        //size=sc.nextInt();
        Collections.addAll(arr, 7,8,3,4,15,13,4,1);
        // for(int i=0;i<size;i++){
        //     arr.add(sc.nextInt());
        // }
        while(!arr.isEmpty()){
            int b=Collections.max(arr);
            int c=Collections.min(arr);
            double avg=(float)(b+c)/2;

            arr1.add(avg);
            //System.out.println(arr1);
            arr.remove(Collections.max(arr));
            arr.remove(Collections.min(arr));
        }
        System.out.println(arr1);
        System.out.println("min: "+Collections.min(arr1));
        sc.close();
    }
}