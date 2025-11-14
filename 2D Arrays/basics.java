
import java.util.*;

public class basics {
    public static boolean SearchKey(int matrix[][], int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("key found at: "+i+","+j);
                    return true;
                    
                }
            }
        }
        return false;

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int matrix[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int key=sc.nextInt();
        System.out.println(SearchKey(matrix, key));
        

    }
    
}
