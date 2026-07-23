import java.util.*;
  class A{
    private int num;
    String name;
    int[] arr;

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.name=name;
    }

    public A(int num,String name){
        this.num=num;
        this.name=name;
        this.arr=new int[num];

    }
}


public class access {
    
public static void main(String[] args) {
    A obj=new A(10,"Ankush");
    System.out.println(obj.name);
}
    
}
