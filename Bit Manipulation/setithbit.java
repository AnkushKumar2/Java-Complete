//set ith bit means to convert ith bit value to 1 
//for this we will use OR operator between n and 1<<i

import java.util.*;

public class setithbit {
    public static int SetithBit(int n,int i){
        int Bitmask=1<<i;
        return n|Bitmask;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        System.out.println(SetithBit(n, i));
    }
    
}
