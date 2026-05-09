import java.util.*;

public class Interleave2Queues {
    public static void interLeave(Queue<Integer>q){
        Queue<Integer>first=new LinkedList<>();
        int n=q.size();
        for(int i=0;i<n/2;i++){
            first.add(q.remove());
        }
        while(!first.isEmpty()){
            q.add(first.remove());
            q.add(q.remove());

        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Queue<Integer>q=new LinkedList<>();
        while(true){
            int num=sc.nextInt();
            if(num==-1){
                break;
            }
            q.add(num);
        }
        interLeave(q);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
        

    }
    
}
