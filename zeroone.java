public class zeroone {
   
        public static void main (String args[]){
            floyd(5);
    
        }
        public static void floyd(int n){
            int num=1;
            for( int i=0;i<n;i++){
              
                for(int j=0;j<i;j++){
                    if((i+j)%2==0){
                        System.out.print("1");
                    }else{
                        System.out.print("0");
                    }
                    System.out.print(" ");
                  
                }
                System.out.println();
            }
            
        }
        
    }
    
    

