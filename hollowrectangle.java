
public class hollowrectangle {

    public static void main(String args[]){
        int n=5;
        pattern1(n);

    }

    public static int pattern1(int n){
        for(int i=0;i<=4;i++){
            for(int j=0;j<=n;j++){
                if(j==0&&j==n-1){
                    System.out.print("*");
                }
               System.out.print("*");
            }
            
           System.out.println();     
        }
        
        
        return 0;
    }
    
    
}
