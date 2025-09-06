


import java.util.*;

// Syntax

// returnType name(){
//     body
//     return statement; 
// }

public class functions {
// //jo function kuch return nhi karta usko void naam dete hai
//     public static void printHello_world(){
//         System.out.println("heyyy");

//     }
// Syntax with parameters

// returnType name(type param1, type param2){
//     body
//     return statement;
// }

public static void Swap(int num1,int num2){//parameters or formal parameters

    Scanner sc=new Scanner(System.in);
    
        int c=num1;
        num1=num2;
        num2=c;
        System.out.println("First number is:"+num1);
        System.out.println("Second number is: "+num2);

}








    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        // System.out.print("heyyy");
        //printHello_world();//function call
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        // int b=sc.nextInt();
        Swap(a,b); //arguments or actual parameters
        




         
    }
}
    

