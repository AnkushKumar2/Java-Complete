import java.util.*;

public class clearrangeofbits {
    public static int RangeofBits(int n,int i,int j){
        int a=(~0)<<j;
        int b=(i+j)>>(~0);
        int Bitmask=a|b;
        return n & Bitmask;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        int j=sc.nextInt();
        System.out.println(RangeofBits(n, i, j));

    }
    
}
