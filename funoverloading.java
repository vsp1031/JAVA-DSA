public class funoverloading {
    /*
     * THE FUNCTION OVERLOADING NOTHING BUT THE MULTIPLE
     *  FUNCTIONS WITH SAME NAME WITH DIFFRENT PARAMATER
     */
    public static void main(String args[]){
        System.out.println(sum(4, 5));
        System.out.println(sum(2, 5, 3));
    }
    public static int sum( int a,int b){
        int sum=a+b;
        return sum;
    }
    
    public static int sum( int a,int b,int c){
        int sum=a+b+c;
        return sum;
    }
}
