import java.util.*;

public class basics {
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    public static void printInc(int  n){
        if(n==1){
            System.out.print(n+" ");
            return ;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    public static int printFact(int n){
        if(n==0){
            
            return 1;
        }
        int Fnm1=printFact(n-1);
        int Fn=n*printFact(n-1);
        return Fn;
    }
    public static void main( String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printDec(n);
        printInc(n);
        System.out.println(printFact(n));
    }
    
}
