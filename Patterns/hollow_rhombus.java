import java.util.*;

public class hollow_rhombus {

    public static void hollow_rhombus_pattern(int totrow,int totcol){
        for(int i=1;i<=totrow;i++){
            for(int j=1;j<=(totrow-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=totcol;k++){
                if(i==totrow||i==1||k==1||k==totcol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // System.out.print("heyyy");
        int row,col;
        row=sc.nextInt();
        col=sc.nextInt();
        hollow_rhombus_pattern(row, col);
    }
    
}
