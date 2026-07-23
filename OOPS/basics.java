import java.util.*;

public class basics {
    public static void main(String args[]){
          Pen p1=new Pen();
    p1.setcolor("blue");
    p1.setTip(5);
    System.out.println(p1.getcolor());
    System.out.println(p1.getTip());
    // p1.color="yellow";
    // p1.tip=10;

    Bank acc=new Bank();
    acc.username="ankush kumar";
    // acc.password="aknncdndnc";
    acc.setPassword("akjgkgsdgfweg");
    


    }
  
    
}

class Pen{
    private String color;
    private int tip;

    String getcolor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setcolor(String newColor){
        this.color=newColor;
    }
    void setTip(int newTip){
       this.tip=newTip;
    }
}

class Bank{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }

}
