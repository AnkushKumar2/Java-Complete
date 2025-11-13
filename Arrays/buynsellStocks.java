import java.util.*;

public class buynsellStocks {

    public static int BuyandSell(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){
                int profit=prices[i]-buyprice;
                maxProfit=Math.max(maxProfit, profit);
            }
            else{
                buyprice=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Max profit will be: "+BuyandSell(arr));
    }
    
}
