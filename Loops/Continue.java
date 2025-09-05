//Continue_Statement
//to skip an iteration




//display all numbers entered by user except multiples of 10
import java.util.*;

public class Continue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.println("hey1");
        do{
            System.out.print("Enter your number");
            int n=sc.nextInt();
            if(n%10==0){
                System.out.println("It is a multiple of 10");
                continue;
            }
            System.out.println(n);

        }while(true);

    }
    
}
