import java.util.*;

public class clearlastibits {
    public static int ClearLast_iBits(int n,int i){
        int Bitmask=(~0)<<i;
        return n&Bitmask;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        System.out.println(ClearLast_iBits(n, i));

    }
    
}
