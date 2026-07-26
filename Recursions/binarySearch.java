import java.util.*;


public class binarySearch {
    static int Search(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return Search(arr,target,s,mid-1);
        }else{
            return Search(arr,target,mid+1,e);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,55,66,78};
        int target=4;
        System.out.println(Search(arr, target, 0, arr.length-1));
        
    }
    
}
