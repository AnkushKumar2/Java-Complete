import java.util.*;

public class pattern_basics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.print("heyyy");
        int n,i,row,col;
        System.out.print("Enter number of rows");
        n=sc.nextInt();
        System.out.print("Enter number of coloumns");
        i=sc.nextInt();
        char name='A';
        for(row=1;row<=n;row++){
            for(col=1;col<=row;col++){
                System.out.print(name);
                name++;
                
            }

            System.out.println();
        }
        // for(row=1;row<=n;row++){
        //     for(col=1;col<=row;col++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
    
}
