//leetcode question
import java.util.*;

public class rotatearray {
    public static void RotateArray(int arr[],int k){
        int temp[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[(i+k)%arr.length]=arr[i];
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int key=sc.nextInt();
        RotateArray(arr, key);

    }
    
}
