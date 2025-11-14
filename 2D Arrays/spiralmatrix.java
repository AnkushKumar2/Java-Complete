import java.util.*;

public class spiralmatrix {
    public static void printSpriral(int matrix[][]){
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol=0;
        int endCol=matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");

            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                System.out.print(matrix[endRow][j]+" ");

            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        
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
        printSpriral(matrix);
    }
    
}
