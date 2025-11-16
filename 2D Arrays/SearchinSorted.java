//In this question to search a key in sorted matrix we are using Staircase Search whose Time complexity is O(n+m)

import java.util.*;

public class SearchinSorted {
    public static boolean StaircaseSearch(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println(row+","+col);
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        return false;


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
    int key=sc.nextInt();
    StaircaseSearch(matrix, key);

    
}
}
