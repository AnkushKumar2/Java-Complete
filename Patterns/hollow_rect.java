import java.util.*;

public class hollow_rect {



    public static void holow_rectangle(int totrow,int totcol){
        for(int i=1;i<=totrow;i++){
            for(int j=1;j<=totcol;j++){
                if(i==1 || j==1 || i==totrow || j==totcol){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row,col;
        row=sc.nextInt();
        col=sc.nextInt();
        holow_rectangle(row, col);


        // System.out.print("heyy");
    }
    
}
