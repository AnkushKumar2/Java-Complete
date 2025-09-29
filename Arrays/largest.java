import java.util.*;

public class largest {

    public static int largest_array(int arr2[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]>largest){
                largest=arr2[i];
            }
        }
        return largest;
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         int arr1[]={1,2,3,89,56,71,45,10};
         System.out.print(largest_array(arr1));



    }
    
}
