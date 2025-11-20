//get ith bit means to check ith position bit is 0 or 1
//for this we will use AND operator between n and 1<<i

import java.util.Scanner;

public class getithbit {
    public static int GetithBit(int n,int i){
        int Bitmask=1<<i;
        if((n&Bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        System.out.println(GetithBit(n, i));

    }
    
}
