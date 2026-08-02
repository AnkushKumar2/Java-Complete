import java.util.*;

public class subsequences{
    private static  void printF(int i,ArrayList<Integer>ans,int[] arr,int n){
        if(i==n){
            for(int d:ans){
                System.out.print(d+" ");
            }
            if(arr.length==0){
                System.out.println(new ArrayList<>());
            }
            System.out.println();
            return;
        }
        //not take
        printF(i+1, ans, arr, n);

        ans.add(arr[i]);
        printF(i+1, ans, arr, n);
        ans.remove(ans.size()-1);


    }
    public static void main(String[] args) {
        int[] arr={3,1,2};
        int n=3;
        ArrayList<Integer>ans=new ArrayList<>();
        printF(0,ans,arr,n);
        
    }
}