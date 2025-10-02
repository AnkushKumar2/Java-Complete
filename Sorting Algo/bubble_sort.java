import java.util.*;

public class bubble_sort {


    public static void Bubble_sort(int arr[]){
          for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<=arr.length-2;j++){
                if(arr[j]>arr[j+1]){
                    // Math.Swap(arr1[j],arr1[j+1]);
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }

            }

        }



        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        
    }
    public static void main(String args[]){



    
        Scanner sc=new Scanner(System.in);
        // int n;
        // n=sc.nextInt();
        int arr1[]={24,45,12,01,25};
        // boolean swapped=0;
        

    Bubble_sort(arr1);

        

    }
    
}
