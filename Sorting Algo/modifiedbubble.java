//this code is modified code of bubble sort whose TC=O(n) in best case 


public class modifiedbubble {
    public static void ModifiedBubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            boolean swapped=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }

            }
            if(swapped==false){
                break;
            }
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={3,2,5,1,0};
        ModifiedBubbleSort(arr);
        printArray(arr);
    }
    
}
