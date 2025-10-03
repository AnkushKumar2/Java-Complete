import java.util.*;


public class inbuilt_sort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Integer arr[]={2,5,89,56,45,23};
        // Arrays.sort(arr,0,5);
        Arrays.sort(arr,0,5,Collections.reverseOrder());
        System.out.print(Arrays.toString(arr));
    }
    
}
