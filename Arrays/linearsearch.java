import java.util.*;


public class linearsearch {

    public static int linear_search(int arr2[],int key){
        
        for(int  i=0;i<arr2.length;i++){
            if(arr2[i]==key){
                return i;
            }
        
        }
        return -1;
        

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr1[]={1,2,3,89,56,71,45,10};
        int key;
        System.out.print("Enter the value of key: ");
        key=sc.nextInt();
        System.out.println(linear_search(arr1, key));
        



    }
    
}
