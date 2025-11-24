import java.util.*;

public class basics {
    //print numbers in descending order
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    //print  numbers in increasing order


    public static void printInc(int  n){
        if(n==1){
            System.out.print(n+" ");
            return ;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    //print factorial of a number

    public static int printFact(int n){
        if(n==0){
            
            return 1;
        }
        int Fnm1=printFact(n-1);
        int Fn=n*printFact(n-1);
        return Fn;
    }
    //print sum of N natural numbers
    public static int printNatural(int n){
        if(n==1){
            return 1 ;
        }
        int f1=printNatural(n-1);
        int f2=n+printNatural(n-1);
        return f2;
    }
    //print Nth fibonacci number
    public static int Fibo(int n){
        if(n==0|n==1){
            return n;
        }
        else{
            int fnm1=Fibo(n-1);
            int fnm2=Fibo(n-2);
            int fn=fnm1+fnm2;
            return fn;

        }
        
    }
    public static void main( String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printDec(n);
        printInc(n);
        System.out.println(printFact(n));
        System.out.println(printNatural(n));
        System.out.println(Fibo(n));
    }
    
}
