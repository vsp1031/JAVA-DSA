public class prime {
    public static void main (String args[]){
        isprime(5);
     //   System.out.println(isprime(5));

    }
    public static void isprime(int n){
        boolean isprime=true;
        for( int i=0;i<n;i++){
            if(n%i==0){
                System.out.println("false");
                return;
            }
           System.out.println();
        }
    
    
    }
    
}
