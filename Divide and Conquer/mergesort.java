//In merge sort we will first divide the array and then start sorting and after sorting we merge the small sorted arrays in a single array
//TC=O(nlogn)
//SC=O(n)
import java.util.*;

public class mergesort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return ;            
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr, si, mid);//left part
        mergeSort(arr, mid+1, ei);//for dividing right part...
        merge(arr,si,ei,mid);
    }
    public static void merge(int arr[],int si,int ei,int mid){
        int temp[]=new int[ei-si+1];
        int i=si;//iterator for left part
        
        int j=mid+1;//iterator for right part
        int k=0;//iterator for temp arr

        while(i<=mid&&j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy temp to original array
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
    
}
