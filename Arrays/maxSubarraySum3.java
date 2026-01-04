// KADANE'S ALGORITHM APPROACH of TIME COMPLEXITY = O(N)

import java.util.*;


public class maxSubarraySum3 {

    public static void kadanes(int num[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<num.length;i++){
            currSum=currSum+num[i];
             maxSum=Math.max(currSum, maxSum);//UPDATE AT EACH STEP
            if(currSum<0){
                currSum=0;
            }
           
        }
        System.out.println("Max subarray Sum: "+maxSum);
    }
    public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    kadanes(arr);

    }
    
}
