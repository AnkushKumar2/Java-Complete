import java.util.ArrayList;
import java.util.*;

public class containerwithmostwater {
    public static int ContainerWithMost(ArrayList<Integer> list){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size()-1;i++){
            
            int ans=0;
            for(int j=i+1;j<list.size();j++){
                int min=Math.min(list.get(i), list.get(j));
                int width=j-i;
                ans=min*width;
                max=Math.max(max, ans);
                ans=0;
                
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
        System.out.println(ContainerWithMost(list));
    }
    
}
