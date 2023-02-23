public class invertedno {
    public static void main (String args[]){
        invertedno(5);
       
    }
    public static int invertedno(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(j);
            }
            System.out.println();

        }return 0;
        
    }
    
}
