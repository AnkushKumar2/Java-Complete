import java.util.*;

public class binarytodecimal {



    public static int BinarytoDecimal(int n){
        int ans=0;
        int rem,mul=1;
        while(n!=0){
            n%2=rem;
            n/=2;
            ans=ans*mul+rem;
            mul*=10;

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
