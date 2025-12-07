import java.util.*;

public class assignQ4 {
    public static int  CountSubSets(String str,int i,String ans){
        int count =0;
        if(i==str.length()){
            if(ans.charAt(0)==ans.charAt(ans.length()-1)){
                count++;
            }
            return count;
        }
        CountSubSets(str, i+1, ans+str.charAt(i));
        CountSubSets(str, i+1, ans);

        
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(CountSubSets(str, 0, new String(" ")));


    }
    
}
