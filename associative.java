import java.util.Scanner;

public class associative {

    /*ASSOCIATIVE KEYWORDS-
                          1)  BREAK
                          2)  CONTINUE
    
    */ 

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
//--------------------------------- { BREAK }---------------------------------------
      
        // do{
        //     System.out.print("ENTER THE NO :- ");
        //     int No=sc.nextInt();
        //     if(No%10==0){
        //         System.out.println("THIS NO IS DIVISIBLE BY 10");
        //         break;
        //     }
            
        //     System.out.println("vivek");
        // }while(true);


//--------------------------------- { CONTINUE }---------------------------------------



     int No1=sc.nextInt();
     for(int i=0;i<5;i++){
        if(i==2){
            continue;
        }
        System.out.println("adi,viki,raj   "+ i);
     }
    }
    
}
