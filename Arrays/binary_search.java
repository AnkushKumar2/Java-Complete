//TC =O(logn)


import java.util.*;

public class binary_search {


    public static int binarySearch(int num[],int key){
        int start=0, end=num.length-1; 

        while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            else if(num[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            

        }
        return -1;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.print("Enter key: ");
        int key=sc.nextInt();

        System.out.println(binarySearch(arr, key));
        
          


    }
    
}
//time complexity=O(log n){worst time complexity}
