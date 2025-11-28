import java.util.*;

public class friendspairingprblm {
    public static int FriendsPairing(int n){
        if(n==1||n==2){
            return n;
        }
        //for single
        int f1=FriendsPairing(n-1);
        //for pairs
        int f2=(n-1)*FriendsPairing(n-2);
        int totalways=f1+f2;
        return totalways;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(FriendsPairing(n));

    }
    
}
