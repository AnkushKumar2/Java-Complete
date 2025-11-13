import java.util.*;

public class assignmentQ1 {
    public static boolean Duplicate(int num[]){
        boolean duplicate=false;
        for(int i=0;i<num.length;i++){
            int end=num.length-1;
            int start=i;
            while(start<end){
                if(num[start]==num[end]){
                    duplicate=true;
                    break;
                }
                else {
                    end--;
                }
            
                

            }
            
                    }
                    return duplicate;

    }
    public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.print(Duplicate(arr));

    }
    
}
