import java.util.*;

public class diagonal {
    public static int DiagonalSum(int matrix[][]){
        int sum=0;
        int primarySum=0;
        int secondarySum=0;
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    primarySum+=matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                    secondarySum+=matrix[i][j];
                }
            }
        }
        sum=primarySum+secondarySum;
    
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
        System.out.print("Both Diagonals Sum will be: "+DiagonalSum(matrix));
    }
    
}
