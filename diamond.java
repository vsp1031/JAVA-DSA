public class diamond {
    public static void main(String args[]){
        diamond1(5);

    }
    public static void diamond1(int n){
        
        for(int i=n;i>0;i--){
            for( int j=i;j>0;j--){
                System.out.print(" ");
            } 
            for( int j=0;j<n-i;j++){
                System.out.print("*");
            } 
            for( int j=0;j<n-i;j++){
                System.out.print("*");
            }   
           
            
            System.out.println();

        }
        for(int i=0;i<n;i++){
            for( int j=i;j>0;j--){
                System.out.print(" ");
            } 
            for( int j=0;j<n-i;j++){
                System.out.print("*");
            } 
            for( int j=0;j<n-i;j++){
                System.out.print("*");
            }   
           
            
            System.out.println();
        }
       
    }
}
