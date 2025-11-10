import java.util.*;

public class max_subarray_sum {
    public static void maxSubarray(int num[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                    currSum += num[k];
                }
                if(maxSum < currSum){
                    maxSum =  currSum;
                }
            }
        }
        System.out.println("Max Subarraysum: "+maxSum);
    }

    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    maxSubarray(arr);
    // Arrays.sort(arr);

    }
    

    
}
