import java.util.*;

public class assigmentQ5 {
    public static void Triplet(int num[]){
        
        for(int i=0;i<num.length;i++){
            int start=i+1;
            int end=num.length-1;
            while(start<end){
                int sum=(num[i]+num[start]+num[end]);
                if(sum==0){
                    System.out.println("["+num[i]+","+num[start]+","+num[end]+"]");
                    break;
                }
                else{
                    end--;
                }

            }
        }
        

    }
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Triplet(arr);
    }
    
}
