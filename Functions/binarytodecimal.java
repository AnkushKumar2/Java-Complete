import java.util.*;

public class binarytodecimal {



    public static int BinarytoDecimal(int n){
        int ans=0;
        int rem,pow=0;
        while(n>0){
            rem=n%10;
            n/=10;
            ans=ans+(rem*(int)Math.pow(2,pow));
            pow++;

        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // System.out.print("heyyy");
        int num;
        num=sc.nextInt();
        System.out.println(BinarytoDecimal(num));

    }
    
}
