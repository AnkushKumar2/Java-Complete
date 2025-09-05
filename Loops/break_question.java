//keep entering number till user enters multiple of 10



import java.util.*;

public class break_question {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // System.out.println("heyy111");
        // int n;
        // System.out.print("Enter the number");
        // n=sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     if(i==n%10){
        //         break;

        //     }
        //     System.out.println(i);
        // }
        // System.out.println("It is a multiple of 10");
         do{
            System.out.print("Enter your number");
            int n=sc.nextInt();
            if(n%10==0){
                System.out.println("It is a multiple of 10");
                break;
            }
            System.out.println(n);
         }while(true);

    }
    
}
