
import java.util.*;
abstract class Parent{

    int age;
    Parent(int age){
        this.age=age;
    }

    static void hello(){
        System.out.println("heyyyyy");
    }
    abstract void career();
    abstract void partner();

    
}

class Son extends Parent{
    Son(int age){
        super(age);

    }

    
    void career(){
        System.out.println("I want to be a doc");
    }
    void partner(){
        System.out.println("i want a caring partner");
    }
}

class Daughter extends Parent{
    Daughter(int age){
        super(age);
    }
    
    void career(){
        System.out.println("Iwant to be a coder");
    }
    void partner(){
        System.out.println("i also want a caring one");
    }
}

public class main {
    public static void main(String[] args) {
        Son son=new Son(34);
        son.career();
        System.out.println(son.age);
        // Parent parent=new Parent(45);//because parent class is abstract it cannot be instantiated or we cant create object of an abstract class

        Parent.hello();//but 
    }
    
}
