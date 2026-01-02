//finding target sum in  a sorted and rotated arrayList
//TC=O(n)

import java.util.*;


public class pairsum2 {
    public static boolean pairSum2(ArrayList<Integer> list,int target){
        int bp=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>=list.get(i+1)){//breaking point
                bp=i;
                break;

            }
        }

        int lp=bp+1;
        int rp=bp;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            else if(list.get(lp)+list.get(rp)>target){
                rp=(list.size()+rp-1)%list.size();
            }
            else{
                lp=(lp+1)%list.size();
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
        int target=sc.nextInt();
        System.out.println(pairSum2(list, target));
        }
    }
    

