public class solidrombus {
    public static void main(String args[]){
        int n=5;
        pattern1(n);

    }

    public static void pattern1(int n){
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
                }
            for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
               System.out.println(" ");
            }
            
         
        }
        
        
      
    }
    

