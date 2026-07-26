import java.util.*;

public class Fibo {
    private static int fibo(int n){
       if(n<2){
        return n;
       }
        int ans=fibo(n-1)+fibo(n-2);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibo(n));
    }
    
}
