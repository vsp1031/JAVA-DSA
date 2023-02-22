public class fact {


    public static void main(String args[]){
        //factorial

        int n=5;
        System.out.println(factorial(n));

        //product
        int a=5;
        int b=10;
    System.out.println(product(a, b));

    }
    // ______________________________{ product}____________________________________





    public static int product(int a,int b){
        int sum=a*b;
        return sum;
    }
    // ______________________________{ factorial}____________________________________

    public static int factorial(int n){
        int fact=1;
     for( int i=1;i<n;i++){
        fact=fact*i;
        

     }
    return fact;
    }
    
}
