import java.util.*;

public class basics {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         ArrayList<Integer> list=new ArrayList<>();
         list.add(2);
         list.add(1,5);
         list.set(1,10);
        //  System.out.println(list.get(1));
        System.out.println(list.contains(20));
        System.out.println(list.contains(10));
        System.out.println(list.size());
        System.out.println(list);
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }

    }
    
}
