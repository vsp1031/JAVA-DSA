
public class swap {

    /*
     * THRE VALUE PASS BY -1) CALL BY VALUE
     *                     2) ALL BY REFRANCE
     *  
     *  IN JAVA ALWAYS CALL BY VALUE 
     * 
     */

    public static void main(String args[]){
        int a=5;
        int b=10;
        swap1(a, b);
        System.out.println("in main function");
        System.out.println(a);
     System.out.println(b);

    }

    public static int swap1(int a,int b){
   
     int temp=a;
     a=b;
     b=temp; 
     System.out.println(" in swap function");
     System.out.println(a);
     System.out.println(b);
     return 0;
            

    }
    
}
