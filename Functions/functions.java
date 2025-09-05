


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

public static int calculatefact(int num1){//parameters or formal parameters

    Scanner sc=new Scanner(System.in);
    
        int fact=1;
        for(int i=1;i<=num1;i++){
            fact=fact*i;
        }

        return fact;

}








    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        // System.out.print("heyyy");
        //printHello_world();//function call
        
        int a=sc.nextInt();
        // int b=sc.nextInt();
        int fact = calculatefact(a); //arguments or actual parameters
        System.out.println("Factorial is  "+fact); 




         
    }
}
    

