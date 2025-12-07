import java.util.*;

public class assignQ4 {
    public static void  CountSubSets(String str,int i,String ans){
        
        if(i==str.length()){
            System.out.println(ans);
            if( ans.length()>0 && ans.charAt(0)==ans.charAt(ans.length()-1) ){
                count++;
            }
            return;
        }
        CountSubSets(str, i+1, ans+str.charAt(i));
        CountSubSets(str, i+1, ans);

        
    }
    static int count=0;
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        CountSubSets(str, 0, "");
        System.out.println(count);


    }
    
}
