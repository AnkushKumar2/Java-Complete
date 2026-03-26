import java.util.*;

public class basics {
    public static void main(String args[]){
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("india",150);
        hm.put("usa",200);
        System.out.println(hm);
        System.out.println(hm.get("india"));

        Set<String> m=hm.keySet();
        for (String k : m) {
            System.out.println(k+"value="+hm.get(k));
            
        }
    }
    
}
