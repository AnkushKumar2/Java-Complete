import java.util.*;

public class butterfly {


    public static void butterfly_pattern(int totrow,int totcol){
        for(int i=1;i<=totrow;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=((2*totrow)-(2*i));k++){
                System.out.print(" ");

            }
            for(int a=1;a<=i;a++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=totrow;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            for(int k=((2*totrow)-(2*i));k>=1;k--){
                System.out.print(" ");
            }
            for(int a=i;a>=1;a--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // System.out.print("heyy");
        int row,col;
        row=sc.nextInt();
        col=sc.nextInt();
        butterfly_pattern(row, col);
        
    }
    
}
