import java.util.*;

public class decimalTobinary {


    public static int DecimaltoBinary(int n){
        int ans=0;
        int rem,pow=0;
        while(n>0){
            rem = n%2;
            n/=2;
            ans=ans+((int)Math.pow(10,pow)*rem);
            pow++;
            
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
