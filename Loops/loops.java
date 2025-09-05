import java.util.*;


public class loops {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //to check if a number is prime or not



         int n,i;

        System.out.print("Enter your number");
        n=sc.nextInt();
        if(n<=2){
            System.out.println("n is  prime");
        }
        else{
            boolean isprime=true;
            for( i=2;i<n;i++){
                if(n%i==0){
                isprime=false;
                }

            }
            if(isprime==true){
                System.out.println("n is prime");
            }
            else{
                System.out.println("n is not prime");

            }
            
        }


        // int n,i,row,col;
        // System.out.print("Enter number of rows:");
        // n=sc.nextInt();
        // System.out.print("Enter number of coloumns:");
        // i=sc.nextInt();
        // for(row=1;row<=n;row++){
        //     for(col=1;col<=i;col++){
        //         System.out.print("*");

        //     }
        //     System.out.println();
        // }


        // int n;
        // n=sc.nextInt();
        // for(int i=0;i<=n;i++){
        //     if(i==4){
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("Iam out");

        // int count=1,n;
        // n=sc.nextInt();
        // do{
        //     System.out.println("#");
        //     count++;
        // }while(count<=n);


        // System.out.print("heyyy"); 
        // int count=1;
        // int n;
        // System.out.print("Enter number:");
        // n=sc.nextInt();
        //   int sum=0;
        // while(count<=n){
          
        //     sum+=count;
           
        //     count++;
             

        // }
        // System.out.println(sum);
        // int num,ans,rem;
        // ans=0;
        // System.out.print("Enter the number");
        // num=sc.nextInt();
        // while(num>0){
            // int rem;
            // rem=num%10;
            // System.out.print(rem+" ");
            // num/=10;
            // ans=ans*10+rem;
        }
        // System.out.println(rem);
    }
    

