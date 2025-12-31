//TC=O(n)
import java.util.*;



public class containerwithmaxwater2 {
    public static int ContainerWithMost2(ArrayList<Integer> list){
        int max=Integer.MIN_VALUE;
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            int min=Math.min(list.get(lp), list.get(rp));
            int width=rp-lp;
            int ans=min*width;
            max=Math.max(max,ans);
            if(list.get(lp)<list.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return max;


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
        System.out.println(ContainerWithMost2(list));

    }
    
}
