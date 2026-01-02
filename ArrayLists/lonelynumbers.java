import java.util.*;

public class lonelynumbers {
    public static void lonelyNum(ArrayList<Integer> list){
        ArrayList<Integer> result=new ArrayList<>();
        if(list.size()==1){
            result.add(list.get(0));
        }
        if(list.get(1)-list.get(0)>1){
            result.add(list.get(0));
        }
        for(int i=1;i<list.size()-1;i++){
            if(list.get(i)-list.get(i-1)>1 && list.get(i+1)-list.get(i)>1){
                result.add(list.get(i));
            }
        }
        if(list.get(list.size()-1)-list.get(list.size()-2)>1){
            result.add(list.get(list.size()-1));
        }

        System.out.println(result);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        while(true){
            int num=sc.nextInt();
            if(num==-1){
                break;
            }
            list.add(num);
        }

        Collections.sort(list);
        lonelyNum(list);

    }
    
}
