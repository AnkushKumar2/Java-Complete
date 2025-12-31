//TC=O(n)

import java.util.*;

public class pairsum1 {
    public static boolean pairSum(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;

            }
            else if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        while(true){
            int num=sc.nextInt();
            if(num==-1){
            break;
            }
            list.add(num);
        }
        Collections.sort(list);
        int n=sc.nextInt();
        System.out.println(pairSum(list, n));
    }
    
}
