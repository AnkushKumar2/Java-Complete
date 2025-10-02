import java.util.*;

public class selection_sort {


    public static  void Selection_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
         int n=sc.nextInt();
        int arr1[] = new int[n];
       
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();

        }
        Selection_sort(arr1);

    }
    
}
