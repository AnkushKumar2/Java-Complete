import java.util.*;


public class RotatedBinary{
    static int Search(int[] arr,int key,int s,int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[s]<=arr[mid]){
            if(key>=arr[s]&&key<=arr[mid]){
                return Search(arr, key, s, mid-1);
            }else{
                return Search(arr, key, mid+1, e);
            }
        }
        if(key>=arr[mid]&&key<=arr[e]){
            return Search(arr, key, mid+1, e);
        }
        return Search(arr, key, s, mid-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={4,5,1,2,3};
        int key=sc.nextInt();
        System.out.println(Search(arr, key, 0, arr.length-1));
        
    }

}