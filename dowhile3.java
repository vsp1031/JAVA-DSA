import java.util.Scanner;

public class dowhile3 {

    //IN THE DO WHILE WECAN TAKE THE MULTIPLE INPUTS FROM THE USER 

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int count=0;//sc.nextInt();
        do{
            System.out.println("hello");
            count++;
            int counts=sc.nextInt();
        }while(count<10);
    }
}
