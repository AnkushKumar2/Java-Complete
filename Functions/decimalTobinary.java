import java.util.*;

public class decimalTobinary {


    public static int DecimaltoBinary(int n){
        int ans=0;
        int rem,mul=1;
        while(n!=0){
            rem = n%10;
            n/=10;
            ans=ans*mul+rem;
            mul*=2;
            
        }
        return ans;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num;
        num=sc.nextInt();
        System.out.println(DecimaltoBinary(num));

    }
    
}
