public class bubblesort {
    public static void main (String args[]){
        int arr[]={9,3,8,2,7,1,6,4,5};
        bubble_sort(arr);
        printarr(arr);
    

    }
    public static void bubble_sort(int arr[]){
        //loop 1
        for(int i=0;i<arr.length;i++){
           // int swap=0;
            //loop 2
            for(int j=0;j<arr.length-1-i;j++){
                //swap++;
                // swap
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }//System.out.println(swap);
        }
    }

    // print array function
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
     
}
