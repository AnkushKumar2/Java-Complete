import java.util.*;

public class basics {
    public static void main(String args[]){
         Stack<Integer>s =new Stack<>();
     s.push(3);
    while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
    }

    }
   
    
}
