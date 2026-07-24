import java.util.*;

import org.w3c.dom.Node;


public class reverse {
    static class Singly{
        private Node head;
        private Node tail;
        
        private class Node{
            int val;
            Node next;

            public Node(int val){
            this.val=val;
        }
           Node(int val,Node next){
            this.val=val;
            this.next=next;

        }
        }
        public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){//this means first item is being added
            tail=head;
        }
        

    }
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return ;
        }


        Node node=new Node(val);
        tail.next=node;
        tail=node;

        
    }
    public void display(){
        Node node=head;
        while(node!=null){
            System.out.print(node.val+"->");
            node=node.next;
        }
        System.out.println();
    }
    //recursion reverse
    private Node  reverse(Node node){
        if(node ==null || node.next==null){
            
            return node;
        }
        Node newHead=reverse(node.next);
        node.next.next=node;
        node.next=null;
    
         return newHead;
    }
    public void reverseList(){
        head=reverse(head);
        Node temp=head;
        while(temp!=null && temp.next!=null){
            temp=temp.next;
        }
        tail=temp;
    }
   

     


    }
    public static void main(String[] args) {
        
        Singly list=new Singly();
        list.insertLast(0);
         list.insertLast(5);
          list.insertLast(4);
           list.insertLast(7);
            list.insertLast(2);
            
    
          list.reverseList();
            
        list.display();    
    }
    
}
