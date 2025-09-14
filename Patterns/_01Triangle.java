import java.util.*;
public class _01Triangle {

    public static void _01Triangle_(int totrow,int totcol){
        int num=1;
        for(int i=1;i<=totrow;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                System.out.print(" ");
                num=(num==1)?0:1;
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
        _01Triangle_(row, col);


    }
    
}
