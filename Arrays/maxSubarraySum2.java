// PREFIX SUM APPROACH OF TIME COMPLEXITY=O(N^2)

import java.util.*;



public class maxSubarraySum2 {
public static void PrefixSum(int num[]){
    int maxSum=Integer.MIN_VALUE;
    int currSum=0;
    int Prefix[]=new int[num.length];
    Prefix[0]=num[0];
    for(int i=1;i<num.length;i++){
        Prefix[i]=num[i]+Prefix[i-1];
    }

    for(int i=0;i<num.length;i++){
        int start=i;
        for(int j=i;j<num.length;j++){
            int end=j;
            currSum=start==0?Prefix[end]:Prefix[end]-Prefix[start-1];

            if(maxSum<currSum){
            maxSum=currSum;
        }
        }
        
    }
    System.out.println("Maxsum is: "+maxSum);
}

    public static void main(String args[]){
          Scanner sc= new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    PrefixSum(arr);


    }
    
}
