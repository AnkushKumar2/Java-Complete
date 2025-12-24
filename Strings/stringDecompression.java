import java.util.*;

public class stringDecompression {
    public static String DecompressString(String str){
        StringBuilder sb=new StringBuilder("");
        int i=0;
        while(i<str.length()){
            char ch=str.charAt(i);
            i++;
            int count=0;
            while(i<str.length() && Character.isDigit(str.charAt(i))){
                count=count*10 +(str.charAt(i)-'0');
                i++;
               
            }
             if(count==0){
                    count=1;
                }
            sb.append(String.valueOf(ch).repeat(count));
        }
        return sb.toString();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(DecompressString(str));

    }
    
}
