//this code has worst time complexity of O(2^n+m) because every cell has two options to move either right or left 

import java.util.*;

public class gridways {
    public static int gridWays(int i,int j,int n,int m){

        if(i==n-1&&j==m-1){//when source is at the target
            return 1;
        }
        else if(i==n||j==m){//when cell exceeds the rows and columns
            return 0;
        }
        int w1=gridWays(i+1, j, n, m);//fot going down
        int w2=gridWays(i, j+1, n, m);//for going right

        int totalways=w1+w2;
        return totalways;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(gridWays(0, 0, n, m));

    }
    
}
