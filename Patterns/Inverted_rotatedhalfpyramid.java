import java.util.*;

public class Inverted_rotatedhalfpyramid {

    public static void Inverted_half_pyramid(int totrow, int totcol){
        for(int i=1;i<=totrow;i++){
            for(int j=1;j<=(totrow-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // System.out.print("heyy")
        int row,col;
        row=sc.nextInt();
        col=sc.nextInt();
        Inverted_half_pyramid(row, col);

    }
    
}
