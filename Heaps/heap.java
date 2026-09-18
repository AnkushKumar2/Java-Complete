import java.util.*;

public class heap {
    static class Heap{
        ArrayList<Integer>list=new ArrayList<>();
        public void add(int data){
            //add at last idx
            list.add(data);

            int x=list.size()-1;//child idx
            int par=(x-1)/2;//parent idx
            while(list.get(x)<list.get(par)){
                int temp=list.get(x);
                list.set(x,list.get(par));
                list.set(par,temp);

                x=par;
                par=(x-1)/2;
            }
        }
        public int peek(){
            return list.get(0);
        }
        public int remove(){
            int data=list.get(0);

            //swap first and last element
            int temp=list.get(0);
            list.set(0,list.get(list.size()-1));
            list.set(list.size()-1,temp);

            //delete last
            list.remove(list.size()-1);

            //heapify
            heapify(0);
            return data;
        }
        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minIdx=i;
            if(left<list.size()&&list.get(minIdx)>list.get(left)){
                minIdx=left;
            }
            if(right<list.size()&&list.get(minIdx)>list.get(right)){
                minIdx=left;
            }
            if(minIdx!=i){
                int temp=list.get(i);
                list.set(i,list.get(minIdx));
                list.set(minIdx,temp);

                heapify(minIdx);
            }

        }
        public boolean isEmpty(){
            return list.size()==0;
        }
    }
    public static void main(String[] args) {
        Heap pq=new Heap();
        pq.add(8);
        pq.add(5);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
    
}
