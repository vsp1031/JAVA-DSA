public class reverse {
    public static void main(String args[]){
        int a=100301;
        while(a>0){
            int reverse=a%10;  // take a last digit 
            System.out.print(reverse);
            // remove a last digit 
             a=a/10;
        }
    }
    
}
