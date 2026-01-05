import java.util.*;

public class stringCompressLeetcode {
    public static int CompressString(char chars[]){
        int idx=0;
        int n=chars.length;
        for(int i=0;i<n;i++){
            char ch=chars[i];
            int count=0;
            while(i<n && chars[i]==ch){
                count++;
                i++;
            }
            if(count==1){
                chars[idx++]=ch;
            }
            else{
                chars[idx++]=ch;
                String str=String.valueOf(count);
                for(char digit:str.toCharArray()){
                    chars[idx++]=digit;
                }
            }
            i--;
        }
        
        return idx;
    }
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    char arr[]=new char[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.next().charAt(0);

    }
     System.out.println(CompressString(arr));

    }
   
    
}
