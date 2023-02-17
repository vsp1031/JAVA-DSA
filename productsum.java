import java.util.Scanner;

public class productsum {

    //product =   A*B (multiplication)
    
    //Sum = A+B
  
    // input from user 

    //  Area of Circle

 public static void main(String args[]){


    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the value of a");
    int a= sc.nextInt();

    System.out.println("Enter the value of b");
    int b= sc.nextInt();

    
     int product = (a*b);
     int  sum = (a+b);


     System.out.println("The product of A and B is =");
     System.out.println(product);

     System.out.println("The sum of A and B is =");
     System.out.println(sum);

       //  Area of Circle

       float pi =(float) 3.14;
       int r=a;

       float area=pi*r*r;
       System.out.println("The Area of Circle is  =");
       System.out.println(area);

    }
}
