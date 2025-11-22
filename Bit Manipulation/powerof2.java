import java.util.*;

public class powerof2 {
    public static boolean isPowerof2(int n){
        return (n&(n-1))==0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPowerof2(n));
    }
    
}
