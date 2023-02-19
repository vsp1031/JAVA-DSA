import java.util.Scanner;


public class taxcalculator {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER YOUR SALARY :- ");
        int Salary=sc.nextInt();
        double tax;

        if( Salary<50000){
         tax=0;
        }
        else if(Salary>50000 &&Salary<500000){
            tax=(float) Salary*(0.2);
        }
        else{
            tax=  tax=(float) Salary*(0.5);
        }
        System.out.println("YOU HAVE TO PAY THIS MUCH OF THE TAX "+ tax);
       
    }
    
}
