import java.util.*;

import org.w3c.dom.Node;

public class circular {
    private Node head;
    private Node tail;

    public circular(){
        this.head=null;
        this.tail=null;
    }

    private class Node{
        int value;
        Node next;

        public Node(int val){
            this.value=val;


        }
        public Node(int val,Node next){
            this.value=val;
            this.next=next;
        }


    }
    public void insert(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public void delete(int val){
        Node node=head;
        if(node==null){
            return;
        }
        if(node.value==val){
            head=head.next;
            tail.next=head;
            return;

        }
        do{
            Node n=node.next;
            if(n.value==val){
                node.next=n.next;
                break;
            }
            node=node.next;
        }while(node!=head);

    }
    public void display(){
        Node node=head;
        if(head!=null){
            do{
                System.out.print(node.value+"->");
                node=node.next;
            }while(node!=head);


            
        }

    }
    public static void main(String[] args) {
        circular list=new circular();
        list.insert(0);
        list.insert(8);
        list.insert(9);
        list.insert(4);
        list.insert(7);
        list.delete(9);
        list.display();

    }
    
}
