//Time Complexity is:O(n)

import java.util.*;

public class DiagonalOptimized {
    public static int DiagonalSum_Optimized(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }

    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter no. of rows: ");
        int m=sc.nextInt();
        System.out.println("Enter no. of coloumns: ");
        int n=sc.nextInt();
        int matrix[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }

    }
    System.out.println("Sum of Diagonals will be: "+DiagonalSum_Optimized(matrix));
    
}
}