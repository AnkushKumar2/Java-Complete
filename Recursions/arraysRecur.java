import java.util.*;

public class arraysRecur {
    //check array is sorted or not
    //TC=O(n) and SC=O(n) 
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);

    }
    //first occurence of an element in an array
    public static int firstOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,3,5};
        int key=sc.nextInt();
        System.out.println(isSorted(arr, 0));
        System.out.println(firstOccurence(arr, key, 0));


    }
    
}
