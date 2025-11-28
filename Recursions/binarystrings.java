import java.util.*;

public class binarystrings {
    public static void printBinString(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return ;
        }
        printBinString(n-1, 0, str+"0");

        if(lastplace==0){
            printBinString(n-1, 1, str+"1");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=new String("");
        int n=sc.nextInt();
        printBinString(n, 0, str);

    }
    
}
