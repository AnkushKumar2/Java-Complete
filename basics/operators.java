import java.util.*;


public class operators {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // System.out.println("Heyy world");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int rem=a%b;
        System.out.println("remiander will be=" +rem);
        a++;
        // System.out.println(a);
        int a=10;
                int c=a++;//post increment

        int b=++a;//pre increment

        System.out.println(a);
        System.out.println(b);
                System.out.println(c);



    }
    
}
