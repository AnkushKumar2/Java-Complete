import java.util.*;


public class swap {
    public static void Swap(ArrayList<Integer>list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> list=new ArrayList<>();
    list.add(2);
    list.add(3);
    list.add(5);
    list.add(9);
    list.add(6);
    int idx=1;
    int idx2=3;
    

    Swap(list, idx, idx2);
    System.out.println(list);
    Collections.sort(list);//for ascending order
    System.out.println(list);

    Collections.sort(list,Collections.reverseOrder());//for descending order
    System.err.println(list);


 }   
}
