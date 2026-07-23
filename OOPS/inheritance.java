import java.util.*;
 class Box{
    double h;
    double l;
    double wid;
     
    static void Greetings(){
        System.out.println("heyyyyyy");
    }

    Box(){
        this.h=-1;
        this.l=-1;
        this.wid=-1;
    }

    Box(double h,double l,double w){
        this.h=h;
        this.l=l;
        this.wid=w;

    }
    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.wid=old.wid;

    }
    Box(double side){
        this.h=side;
        this.l=side;
        this.wid=side;
    }
}
 class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        super();
        this.weight=-1;
    }
    BoxWeight(double h,double l,double wid,double weight){
        super(h, l, wid);
         this.weight=weight;
    }
    BoxWeight(BoxWeight other){
        super(other);
        this.weight=other.weight;
    }
    BoxWeight(double side,double weight){
        super(side);
        this.weight=weight;
    }

    
}
class BoxPrice extends BoxWeight{
        double cost;
        BoxPrice(){
            super();
            this.cost=-1;
        }
        BoxPrice(BoxPrice other){
            super(other);
            this.cost=other.cost;
        }
        BoxPrice(double h,double l,double wid,double weight, double cost){
            super(h,l,wid,weight);
            this.cost=cost;
        }
        BoxPrice(double side,double weight,double cost){
            super(side,weight);
            this.cost=cost;
        }
    }


public class inheritance {
    public static void main(String[] args) {
        // BoxWeight box1=new BoxWeight(23,56,21,14);
        // System.out.println(box1.weight+" "+box1.h);
    //     Box box2=new BoxWeight(12,15,46,89);
    //     System.out.println(box2.wid);
    // BoxWeight box3=new BoxWeight();
    // System.out.println(box3.weight+" "+box3.h);

    BoxPrice box=new BoxPrice();
     box.Greetings();//i.e. static methods can be inherited but cant be overiden because the main class one is always going to be called 
     //here also i declared static method in main box class but called through its child



    }
    
    
}
