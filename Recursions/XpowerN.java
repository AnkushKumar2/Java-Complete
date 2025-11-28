import java.util.*;


public class XpowerN {
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        return x*pow(x, n-1);
    }
    //Optimized code
    public static int pow2(int x,int n){
        if(n==0){
            return 1;
        }
        int f1=pow2(x, n/2);
        int f2=f1*f1;
        if(n%2!=0){
            f2=x*f2;
        }
        return f2;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(pow(x, n));
        System.out.println(pow2(x, n));
    }
    
}
