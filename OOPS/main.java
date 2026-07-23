import java.util.*;

public class main {
   public static void main(String args[]){
     class Student{
        int rno;
        String name;
        float marks;
        Student(){
            // this.rno=15;
            // this.name="kunal";
            // this.marks=45.6f;
            //this is similar to: Student(int rno,String name,float marks)
            this(13,"kunal",10.0f);
        }

        Student(int rno,String name,float marks){
            this.rno=rno;
            this.name=name;
            this.marks=marks;

        }
    }

Student kunal=new Student();
System.out.println(kunal.name);
System.out.println(kunal.marks);
   }

    
    
}
