// in this we will change ith bit to either 0 or 1
// for this first we will use clearithbit function and then for bitmask we will use newBit and then we will use OR operator between n(cleared n) and newBit<<i
import java.util.*;

public class updateithbit {
    public static int ClearithBit(int n, int i){
        int bitMask=1<<i;
        return n^bitMask;

    }
    public static int UpdateithBit(int n,int newBit,int i){
          n=ClearithBit(n, i);
         int BitMask=newBit<<i;
         return n|BitMask;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        int val=sc.nextInt();
        System.out.println(UpdateithBit(n, val, i));
    }
    
}
