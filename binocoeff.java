public class binocoeff {

/*BINOMIAL COEFFICENT:-  N!/R!(N-R)!

                        1) FACTORIAL OF N
                        2) FACTORIAL OF R
                        3) FACTORIAL OF N-R
                        4) INT BINO COEFF = N!/R!(N-R)!
                
 * 
 * 
 */



    public static void main(String args[]){
        int n=4;
        int r=5;
        System.out.println(factorial(n));
        System.out.println(binocoeff(n, r));

    }

    //______________________________________{factorial}______________________________________
    public static int factorial(int n){
        int fact=1;
        for( int i=1;i<n;i++){
            fact=fact*i;
        }
        return fact;
    }
    
    //________________________________________{binomial coeficent}____________________________________
    public static  int binocoeff(int n ,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);
        int ans=(fact_n*fact_r)/fact_nmr;
        return ans;
    } 
    
}
