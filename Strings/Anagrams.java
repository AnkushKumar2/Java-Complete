import java.util.*;

public class Anagrams {
    public static void AnagramsCheck(String str1,String str2){
        str1.toLowerCase();
        str2.toLowerCase();
        if(str1.length()==str2.length()){
            char str1chararray[]=str1.toCharArray();
            char str2chararray[]=str2.toCharArray();

            Arrays.sort(str1chararray);
            Arrays.sort(str2chararray);

            Boolean result=Arrays.equals(str1chararray, str2chararray);

            if(result){
                System.out.println( "true");
            }
            else{
                System.out.println("false");
            }
        }
        else{
            System.out.println("false");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        AnagramsCheck(str1, str2);

    }
    
}
