
public class counting {
    public static void main(String args[]){
        int arr[]={9,3,8,2,7,1,6,4,5};
        counting(arr);
        printArray(arr);
    }
    public static void counting(int arr[]){
        int largest= Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }

        //count
        /*
         * HERE COUNT THE FREQUENCY OF THE ARRAY ELEMETS
         */
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //sorting
        /*
         * HERE SORT THE COUNT ARRAY 
         */
        int j=0;
        for(int i=0;i<count.length;i++){
            arr[j]=i;
            j++;
            count[i]--;
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    
    
}
// for solving the examples 
//3,6,2,1,8,7,4,5,3,1
