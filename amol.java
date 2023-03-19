import java.net.Socket;
import java.util.Scanner;

public class amol {
    public static void main (String args[]){


        //Scanner sc =new Scanner(System.in);
        long arr[]={1,2,3,4};
        solve(arr, 4);

    
    }
           
    // public static void subarray(int arr[]){
    //     int currsum=0;
    //         for(int i=0;i<1;i++){
               
    //            for(int j=0;j<arr.length;j++){
    //                int end=j;
    //                currsum=currsum+arr[j];
    //                 System.out.print(currsum+" ");
    //             }
    //         System.out.println();
    //         }
    // }

    public static String solve(long [] arr, long N){
        long sum=0;
        for(int i=0;i<arr.length;i++){
                sum += arr[i];
                if(sum==0){
                    return "YES";
                }
                
        }
       
        return "NO";
}
}