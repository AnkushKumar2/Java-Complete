public class sorted_rotatedArray {
    public static int Search_RotatedArray(int arr[],int tar,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(arr[mid]==tar){
            return mid;
        }
        //mid on L1
        if(arr[si]<=arr[mid]){
            //case a:left
            if(arr[si]<=tar&&tar<=arr[mid]){
               return Search_RotatedArray(arr, tar, si, mid-1);
            }
            //case b:right
            else{
               return Search_RotatedArray(arr, tar, mid+1, ei);
            }
            
        }
        //mid on L2
        else{
            //case c: right
            if(arr[mid]<=tar&&tar<=ei){
               return Search_RotatedArray(arr, tar, mid+1, ei);
            }
            //case d : left
            else{
              return  Search_RotatedArray(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        int Tidx=Search_RotatedArray(arr, target, 0, arr.length-1);
        System.out.println(Tidx);
    }
    
}
