import java.util.*;

public class majorityElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }

            //or in place of if-else condition we can also write
            //hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }

        for (Integer i : hm.keySet()) {
            if(hm.get(i)>arr.length/3){
                System.out.println(i);
            }
            
        }
    }
    
}
