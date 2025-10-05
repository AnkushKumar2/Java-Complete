//It counts the frequency(i.e kitni baar wo item repeat hui h array m)of items appearing in an array and then sorting the original array according to the frequency


import java.util.*;

public class counting_sort {


    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }

        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;


            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        countingSort(arr);



    }
    
}
