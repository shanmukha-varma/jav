import java.util.*;
// public class Node{
//     int data;
//     int next;
// }
public class LinkedListex extends Node{
    private static Node head;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int op;
        //Node n=new Node();
        while(true){
            System.out.println("Choose your options:");
            System.out.println("1.Insert /n 2.Delete /n 3.display /n 4.exit");
            op=sc.nextInt();
            switch(op){
                case 1:
                        System.out.println("Enter your data");
                        int n1=sc.nextInt();
                        Insert(n1);
                case 2:
                        Delete();
                case 3:
                        Display();
                case 4:
                        System.exit(0);
            }
        }
    }
    public static boolean isEmpty(){
        return head==null;
    }
    static void Insert(int data){
        if(isEmpty()){
            Node temp=new Node();
            temp.data=data;
            head=temp;
            return;
        }
        Node current=new Node();
        current=head;
        while(current.next!=null){
            current=current.next;
        }
        current=current.next;
        current.data=data;

    }
    static void Delete(){
        if(isEmpty()){
            System.out.println("list is empty");
            return;
        }
        Node current=new Node();
        while(current.next!=null){
            current=current.next;
        }
        current.next=null;
    }
    static void Display(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        Node current=new Node();
        System.out.print("List is: ");
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println();
    }
}
