import java.util.*;

public class oddoreven {
    public static void OddorEven(int n){
        int Bitmask=1;
        if((n & Bitmask)==0){
            System.out.println("Even ");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        OddorEven(n);

    }
    
}
