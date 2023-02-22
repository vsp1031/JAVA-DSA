import java.util.Scanner;


public class functionbasic {




    /*NOTE:
           1) IF THERE IS void THEN NO NEED TO WRITE   return;

               public static VOID main(String args[]){
                   
     *      2) IF THERE IS int  THEN  NEED TO WRITE   return 0;

               public static INT main(String args[]){
     * 
    */


    public static void basic1(){
        for( int i=0;i<5;i++){
            System.out.println("hello world");
        }
        //for void return is not mandatory 
    }    

    public static int basic2(int no){
       
        for( int i=0;i<11;i++){
            System.out.println("                           "+no+" * "+i+" = "+no*i);  
        }
       return 0;
       //for int the RETURN  in mandatory
        
    }    



    public static  void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("WHICH TABLE YOU WANT :-");
        

        int no= sc.nextInt();
        System.out.println("YOR TABLE IS READY");

        basic2(no);

    }


    

}
