import java.util.*;

public class tilingprblm {
    public static int TotalWays(int n){
        if(n==0|n==1){
            return 1;
        }
        int f1=TotalWays(n-1);
        int f2=TotalWays(n-2);
        int total=f1+f2;
        return total;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(TotalWays(n));
    }
    
}
