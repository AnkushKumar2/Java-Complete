//Shortest path means displacement using formula sq.root((x2-x1)^2+(y2-y1)^2)

import java.util.*;

public class shortestpath {
    public static float ShortestPath(String str){
        int x=0;
        int y=0;
        float disp=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='w'){
                x--;
            }
            else if(str.charAt(i)=='n'){
                y++;
            }
            else if(str.charAt(i)=='e'){
                x++;
            }
            else{
                y--;
            }
        }
        int x2=x*x;
        int y2=y*y;

        disp=(float)Math.sqrt(x2+y2);
        return disp; 
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(  ShortestPath(str));
      

    }
    
}
