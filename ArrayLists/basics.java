import java.util.*;

public class basics {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //  ArrayList<Integer> list=new ArrayList<>();
        //  list.add(2);
        //  list.add(1,5);
        //  list.set(1,10);
        // //  System.out.println(list.get(1));
        // System.out.println(list.contains(20));
        // System.out.println(list.contains(10));
        // System.out.println(list.size());
        // System.out.println(list);
        // for(int i=list.size()-1;i>=0;i--){
        //     System.out.println(list.get(i));
        // }

        //MultiDimensional Arraylists

        // ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        // ArrayList<Integer>list=new ArrayList<>();
        // list.add(2);
        // list.add(3);
        // mainList.add(list);
        // ArrayList<Integer>list2=new ArrayList<>();
        // list2.add(4);
        // list2.add(5);
        // mainList.add(list2);
        // for(int i=0;i<mainList.size();i++){
        //     ArrayList<Integer>currList=mainList.get(i);
        //     for(int j=0;j<currList.size();j++){
        //         System.out.print(currList.get(j)+" ");
        //     }
        //     System.out.println();
        // }

        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();

        for(int i=1;i<=5;i++){
            list1.add(i*2);
            list2.add(i*3);
            list3.add(i*4);

        }
        

        mainList.add(list1);

        mainList.add(list2);

        mainList.add(list3);
        System.out.println(mainList);

    }
    
}
