import java.util.*;

public class bubble_sort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // int n;
        // n=sc.nextInt();
        int arr1[]={24,45,12,01,25};
        // boolean swapped=0;
        
        for(int i=arr1.length-2;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr1[j]>arr1[j+1]){
                    // Math.Swap(arr1[j],arr1[j+1]);
                    int temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;

                }

            }

        }
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

        

    }
    
}
