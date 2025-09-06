import java.util.*;
public class primes_inRange {

    public static boolean isPrime(int n){
         if(n<=2){
            return true;
        }
        else{
            //  boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

        }
    
        
        
        }
        public static void primesInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
        
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        primesInRange(num);
        

    }
    
}
