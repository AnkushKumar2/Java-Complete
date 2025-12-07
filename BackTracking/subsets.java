import java.util.*;

public class subsets {
    public static void printSubsets(String str,int i,String ans){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //yes choice
        printSubsets(str, i+1, ans+str.charAt(i));
        //no choice
        printSubsets(str, i+1, ans);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        printSubsets(str, 0, new String(" "));
    }
    
}
