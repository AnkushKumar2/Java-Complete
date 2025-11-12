import java.util.*;

public class trappedrainwater {

    public static int TrappedRainwater(int height[]){
        int n=height.length;
        //to calculate left max boundary using array
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        //to calculate right max boundary using array
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        //using loop find waterlevel using min(leftmax bound, rightmax bound)
        //trapped water=waterlevel-height of each block
        int trappedwater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftMax[i],rightMax[i]);
            trappedwater+=(waterlevel-height[i]);
        }
        return trappedwater;


    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Trapped water will be: "+TrappedRainwater(arr));
    }
    
    
}
