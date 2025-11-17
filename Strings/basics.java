//Strings are IMMUTABLE

import java.util.*;

public class basics {
    public static void main(String args[] ){
        char arr []={'a','b','c','d'};
        String str="abcd";
        String str2=new String("xyz");
        Scanner sc=new Scanner(System.in);
        String name;
        name=sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());
        String firstname="Ankush";
        String lastname="Kumar";
        System.out.println(firstname.charAt(4));


    }
    
}
