import java.util.*;

public class doubly {
    private Node head;
    private Node tail;
    private int size;
    doubly(){
        this.size=0;
    }

    private class Node{
        private int  value;
        private Node next;
        private Node prev;

         public Node(int val){
        this.value=val;
    }
     public Node(int val,Node next,Node prev){
        this.value=val;
        this.next=next;
        this.prev=prev;
    }
    }

    
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
             head.prev=node;

        }
        head=node;
        size++;
       

    }
    public void insertLast(int val){
        Node node =new Node(val);
        Node last=head;
        node.next=null;
        if(head==null){
            node.prev=null;
            head=node;
            return;


        }
        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        
        node.prev=last;
        size++;
         
       
       
    }
     public Node find(int value){
         Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;

    }
    public void insert(int after,int val ){
        Node p=find(after);
        if(p==null){
            System.out.println("does not exist");
            return;

        }
        Node node=new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null){
            node.next.prev=node;

        }
        size++;
        


    }
    public void display(){
        Node node=head;
        Node last=null;
        while(node!=null){
            System.out.print(node.value+"->");
            last=node;
            node=node.next;
        }
        System.out.println();
        System.out.println("print in reverse");
        while(last!=null){
            System.out.print(last.value+"->");
            last=last.prev;
    }
    System.out.println();

    }
        public static void main(String[] args) {
        doubly list=new doubly();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(8);
        list.insertFirst(45);
        list.insertFirst(9);
        list.insertLast(0);
        list.insert(45,65);
        list.display();
    }
    
}
