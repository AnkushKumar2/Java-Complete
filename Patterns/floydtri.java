import java.util.*;

public class floydtri {
    public static void Floydtri(int totrow,int totcol){
        int num=1;
        for(int i=1;i<=totrow;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                System.out.print(" ");
                num++;
                

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
        Floydtri(row, col);



    
    
}
}
