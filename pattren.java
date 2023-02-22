public class pattren {
   
        public static void main(String args[]){
          int n=5;
          pattern(n);
    
        }
        public static void pattern(int n){
            for(int i=0;i<=n;i++){
                for(int k=0;k<=i;k++){
                    System.out.print("*");
                }
                for(int j=(n-i)*2;j>0;j--){
                    System.out.print("_");
                }
                for(int k=0;k<=i;k++){
                    System.out.print("*");
                }
               

                System.out.println();
            }

            for(int i=5;i>=0;i--){
                for(int k=0;k<=i;k++){
                    System.out.print("*");
                }
                for(int j=(n-i)*2;j>0;j--){
                    System.out.print("_");
                }
                for(int k=0;k<=i;k++){
                    System.out.print("*");
                }
               

                System.out.println();
            }
        }
        
    }
    
    

