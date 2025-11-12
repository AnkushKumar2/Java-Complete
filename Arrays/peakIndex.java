import java.util.*;


public class peakIndex {
    public static int PeakIndex(int num[]){
        int start=0;
        int end=num.length-1;
        
        while(start<=end){
            int mid=end+(start-end)/2;
            if(num[mid]>num[mid-1]&&num[mid]>num[mid+1]){
               return mid;
            }
            if(num[mid]>num[mid-1]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        return -1;
    
        

    }
    public static void main(String args[]){
        int arr[]={0,2,4,5,9,7,1};
        System.out.print("Peak index value is: "+PeakIndex(arr));
    }
}
