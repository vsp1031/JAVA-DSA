public class inverted{
    public static void main(String args[]){
        int n=5;
      inverted(n);
    }
    public static int inverted(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("_");
            }

            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
                System.out.println();
            }
            return 0;
        }
        // for(int j=0;j<n;j++){
        //     System.out.print("*");
        // }
        
        

    }
   



    

