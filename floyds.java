public class floyds {
    public static void main (String args[]){
        floyd(5);

    }
    public static void floyd(int n){
        int num=1;
        for( int i=0;i<n;i++){
          
            for(int j=0;j<i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
        
    }
    
}
