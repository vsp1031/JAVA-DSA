import java.util.Arrays;
import java.util.Collections;

public class inbuildsort {
    public static void main(String args[]){
        Integer arr[]={9,3,8,2,7,1,6,4,5};

        // DESCENDING (REVERSE) SORT THE ARRAY..
        Arrays.sort(arr,Collections.reverseOrder());

        // ASCENDING  SORT THE ARRAY..

        Arrays.sort(arr);
        printArray(arr);

    }
    
    public static void printArray(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }    

}
