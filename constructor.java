import java.util.jar.Attributes.Name;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

/*
 * TYPES OF CONSTRUCTOR:-
 *                    1)NON PARAMATRIZE CONSTRUCTOR
 *                    2)PARAMETER CONSTRUCTOR
 *                    3)COPY CONSTRUCTOR
 * 
 */
public class constructor {

    public static void main(String args[]){
        Student s1=new Student();
        s1.name="vivek";
    
        s1.Roll_no=76;
       s1.marks=90;


        

    }
    
}


class Student{
    String name;
    int Roll_no;
    int marks;
    
    //  1)NON PARAMATRIZE CONSTRUCTOR
    Student(){
        System.out.println("print in the student class.....");
    }

    //  2)PARAMATRIZE CONSTRUCTOR
    Student(String name){
        this.name=name;
        System.out.println(name);
    }

    // Student(Student s1){
    // }

    Student(int Roll_no){
         // this.marks=marks;
        System.out.println(marks);
    }
    
}