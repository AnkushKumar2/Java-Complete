import java.util.*;

public class practiceArrray {
    // public static int BinarySearch(int arr[],int key){
    //     int start=0;
    //     int end=arr.length-1;
    //     while(start<=end){
    //           int mid=(start+end/2);
    //     if(arr[mid]==key){
    //         return mid;
            
    //     }
    //     else if(arr[mid]<key){
    //         start=mid+1;
    //     }
    //     else{
    //         end=mid-1;
    //     }

    //     }
      
    //     return -1;

    // }
    // public static void maxSubarraySum(int num[]){
    //     int currSum=0;
    //     int maxSum=Integer.MIN_VALUE;
    //     for(int i=0;i<num.length;i++){
    //         int start=i;
    //         for(int j=i;j<num.length;j++){
    //             int end=j;
    //             currSum=0;
    //             for(int k=i;k<=j;k++){
    //                 currSum+=num[k];
                    
        
    //             }
    //             if(maxSum<currSum){
    //         maxSum=currSum;
    //     }
    //         }
    //     }
    //     System.out.println(maxSum);
    // }
    // public static int maxSubarraySum2(int num[]){
    //     int curr=0;
    //     int max=Integer.MIN_VALUE;
    //     for(int i=0;i<num.length;i++){
    //         curr=curr+num[i];
    //         if(curr<0){
    //             curr=0;
    //         }
    //         max=Math.max(max,curr);
    //     }
    //     return max;
        
    // }
    // public static int TrappedWater(int num[]){
    //     int n=num.length;
    //     int leftMax=new int[n];
    //     leftMax[0]=num[0];
    //     for(int i=1;i<n;i++){
    //         leftMax[i]=Math.max(num[i],leftMax[i-1]);
    //     }

    //     int rightMax=new int[n];
    //     rightMax[n-1]=num[n-1];
    //     for(int i=n-2;i>=0;i--){
    //         rightMax[i]=Math.max(num[i],rightMax[i+1]);
    //     }

    //     int trapped=0;
    //     for(int i=0;i<n;i++){
    //         int water=Math.min(leftMax[i],rightMax[i]);
    //         trapped+=(water-num[i]);
    //     }
    //     return trapped;
    // }
    // public static String toUppercase(String str){
    //     StringBuilder sb=new StringBuilder("");
    //     sb.append(Character.toUpperCase(str.charAt(0)));
    //     for(int i=1;i<str.length();i++){
    //         if(str.charAt(i)==' ' && i<str.length()-1){
    //             sb.append(str.charAt(i));
    //             i++;
    //             sb.append(Character.toUpperCase(str.charAt(i)));

    //         }
    //         else{
    //             sb.append(str.charAt(i));
    //         }

    //     }
    //     return sb.toString();

    // }
    // public static float shortestPath(String str){
    //     int x=0;
    //     int y=0;
    //     float result=0;
    //     for(int i=0;i<str.length();i++){
    //         if(str.charAt(i)=='w'){
    //             x--;
    //         }
    //         else if(str.charAt(i)=='n'){
    //             y++;
    //         }
    //         else if(str.charAt(i)=='e'){
    //             x++;
    //         }
    //         else{
    //             y--;
    //         }
    //     }
    //     int x2=x*x;
    //     int y2=y*y;
    //     result=(float)Math.sqrt(x2+y2);
    //     return result;
    // }
    // public static String Compress(String str){
    //     StringBuilder sb=new StringBuilder(" ");
       
    //     for(int i=0;i<str.length();i++){
    //          int count =1;
    //         while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
    //             count++;
    //             i++;
    //         }
    //         sb.append(str.charAt(i));
    //         if(count>1){
    //             sb.append(count);
    //         }
    //     }
    //     return sb.toString();
    // }
    public static void checkAnagrams(String str1,String str2){
        if(str1.length()==str2.length()){
            str1.toLowerCase();
            str2.toLowerCase();
            char charArray1[]=str1.toCharArray();
            char charArray2[]=str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            Boolean result=Arrays.equals(charArray1,charArray2);
            if(result){
                System.out.println("true");

            }
            else{
                System.out.println("false");
            }
        }
        else{
            System.out.println("false");
        }
    }


    
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
    //     int i =sc.nextInt();
    //     System.out.print(i);
    // int n=sc.nextInt();
    // int arr[]=new int[n];
    // for(int i=0;i<n;i++){
    //     arr[i]=sc.nextInt();
    // }
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    checkAnagrams(str1, str2);

    // int key=sc.nextInt();
    // System.out.println(BinarySearch(arr, key));
    // maxSubarraySum(arr);
    // System.out.println(maxSubarraySum2(arr));
    // System.out.println(TrappedWater(arr));

    }
        

    
    
}
