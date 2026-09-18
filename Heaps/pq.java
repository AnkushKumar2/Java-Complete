import java.util.*;

public class pq {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.add(8);
        pq.add(15);
        pq.add(1);
        pq.add(5);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
        PriorityQueue<Integer>pq2=new PriorityQueue<>(Comparator.reverseOrder());
        pq2.add(8);
        pq2.add(15);
        pq2.add(1);
        pq2.add(5);

           while(!pq2.isEmpty()){
            System.out.println(pq2.peek());
            pq2.remove();
        }



    }
    
}
