import java.util.*;


public class staticBlocks {
    static int  a=4;
    static int b=9;
    static int c;

    static void display(){
        System.out.println("I am a static member");
         System.out.println(c=a*b); 
         
    }
    public static void main(String[] args) {
        staticBlocks obj=new staticBlocks();
        System.out.println(staticBlocks.a+" "+staticBlocks.b);
        obj.display();
    }
    
}
