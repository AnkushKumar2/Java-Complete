package LinkedList;
import java.util.*;

public class basic {
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    public static void addFirst(String data ){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;

        }
        newNode.next=head;
        head=newNode;   
    }

    public static void main(String args[]){
      LinkedList list=new LinkedList<>();

    }
    
}
