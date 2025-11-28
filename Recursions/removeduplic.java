import java.util.*;


public class removeduplic {
    public static void RemoveDuplicates(String str,int i,StringBuilder newStr,boolean map[]){
        if(i==str.length()){
            System.out.println(newStr);
            return;
        }
        char ch=str.charAt(i);
        if(map[ch-'a']==true){
            RemoveDuplicates(str, i+1, newStr, map);
        }
        else{
            map[ch-'a']=true;
            RemoveDuplicates(str, i+1, newStr.append(ch), map);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder newStr= new StringBuilder(" ");
        RemoveDuplicates(str, 0, newStr, new boolean[26]);
    }
    
}
