// in clear ith bit we will convert ith bit to 0 and return value
// for this we will use XOR operator between n and 1<<i 
import java.util.*;

public class clearithbit {
    public static int ClearithBit(int n, int i){
        int Bitmask=1<<i;
        return n^Bitmask;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        System.out.println(ClearithBit(n, i));


    }
    
}
