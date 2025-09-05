import java.util.*;

public class ifelse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int age;
        // System.out.print("Enter the age:");
        // age=sc.nextInt();
        // if(age>=18){
        //     System.out.println("Eligible to vote");
        // }
        // else{
        //     System.out.println("Not Eligible to vote");
        // }
        // int a,b,c;
        // a=sc.nextInt();
        // b=sc.nextInt();
        // c=sc.nextInt();
        // if(a>=b && a>=c){
        //     System.out.println("Largest number is a");
        // }
        // else if(b>=c){
        //     System.out.println("Largest numner is b");

        // }
        // else{
        //     System.out.println("Largest number is c");
        // }
        char sym;
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.print("Enter your operator");
        sym=sc.next().charAt(0);
        switch(sym){
            case '+': System.out.println(a+b);
            break;
            case '-': System.out.println(a-b);
            break;
            case '*': System.out.println(a*b);
            break;
            default : System.out.println(a/b);
        }

    }
    
}
