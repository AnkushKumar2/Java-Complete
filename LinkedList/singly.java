import java.util.*;

import org.w3c.dom.Node;



public class singly {
      private Node head;
    private Node tail;
    private int size;


    singly(){
        this.size=0;
    }
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){//this means first item is being added
            tail=head;
        }
        size+=1;

    }
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return ;
        }


        Node node=new Node(val);
        tail.next=node;
        tail=node;

        size+=1;
    }
    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }

        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;

        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size+=1;

    }
    //insert using recursion
    public void insertRec(int val,int index){
        head=insertRec(val, index, head);

    }
    private Node insertRec(int val,int index,Node node){
        if(index==0){
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next=insertRec(val, index-1, node.next);
        return node;
    }
    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public int deleteFirst(){
        int value=head.val;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return value;
        
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int value=tail.val;
        tail=secondLast;
        tail.next=null;
        size--;

        return value;

         
    }
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }

        Node previous=get(index-1);
        int value=previous.next.val;
        previous.next=previous.next.next;
        size--;

        return value;

    }
    public Node find(int value){
         Node node=head;
        while(node!=null){
            if(node.val==value){
                return node;
            }
            node=node.next;
        }
        return null;

    }
     public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"-> ");
            temp=temp.next;
        }
        System.out.println();
     }

    private class Node{
        private int val;
        private Node next;

        Node(int value){
            this.val=value;
        }
        Node(int value,Node next){
            this.val=value;
            this.next=next;
        }
    }
    //merge two sorted linked list
    public static singly merge(singly first,singly second){
        Node f=first.head;
        Node s=second.head;

        singly ans=new singly();
        while(f!=null && s!=null){
            if(f.val<s.val){
                ans.insertLast(f.val);
                f=f.next;
            }else{
                ans.insertLast(s.val);
                s=s.next;
            }
        }
        while(f!=null){
            ans.insertLast(f.val);
            f=f.next;
        }
         while(s!=null){
            ans.insertLast(s.val);
            s=s.next;
        }
        return ans;
    }
    

    public static void main(String[] args) {
        singly list=new singly();
        list.insertFirst(3);
         list.insertFirst(4);
          list.insertFirst(5);
           list.insertFirst(8);
            list.insertFirst(10);
        list.insertLast(99);
        list.insert(150,5);
        list.display();    
        System.out.println(list.deleteFirst());
        list.display();   
        System.out.println(list.deleteLast());
        list.display(); 
        System.out.println(list.delete(2));
        list.insertRec(88, 2);
        list.display();

        singly first=new singly();
        singly second=new singly();

        first.insertLast(1);
         first.insertLast(2);
          first.insertLast(3);
         first.insertLast(8);
         
          second.insertLast(1);
         second.insertLast(8);
          second.insertLast(10);
           second.insertLast(11);

          singly ans=singly.merge(first, second);
           ans.display();

         
        
    }
    
}
