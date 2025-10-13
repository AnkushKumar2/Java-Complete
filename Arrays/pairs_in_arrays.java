import java.util.*;

public class pairs_in_arrays {

    public static void pairs(int num[]){
        for(int i=0;i<num.length;i++){
            int curr=num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+curr+","+num[j]+")"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){

         Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        pairs(arr);

    }
    
}
