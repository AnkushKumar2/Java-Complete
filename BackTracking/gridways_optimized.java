//this code has a linear time complexity because we are using a permutation formula as w.k.t. for a nxm matrix we have  a total (n-1)down turns for row and a total of (m-1) right turns for col
//TC=O(n+m)

import java.util.*;

public class gridways_optimized {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int f1=fact(n-1);
        int f2=n*f1;

        return f2;
    }

    public static int gridWays(int n,int m){
        int f1=(n+m-2);
        int f2=(n-1);
        int f3=(m-1);

        int ans=fact(f1)/(fact(f2)*fact(f3));

        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        System.out.println(gridWays(n, m));
        
    }
    
}
