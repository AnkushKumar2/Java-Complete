import java.util.*;



public class binomial_coeff {


    public static int fact(int num){

        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;

    }
    public static int bino_coeff(int num1,int num2,int num3){
        int ans=num1/(num2*num3);
        return ans;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,r;
        n=sc.nextInt();
        r=sc.nextInt();
        int a=fact(n);
        int b=fact(r);
        int c=fact(n-r);

        int ans=bino_coeff(a, b, c);
        System.out.println(ans);
        
    }
    
}
