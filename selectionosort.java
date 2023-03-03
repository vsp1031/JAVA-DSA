public class selectionosort {
    public static void main(String args[]){
        int arr[]={9,3,8,2,7,1,6,4,5};
        selection_sort(arr);
        printarray(arr);

    }
    public static void selection_sort(int arr[]){
    
    for(int i=0;i<arr.length;i++){
        int minpos=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[minpos]>arr[j]){
                minpos=j;
            }
        }
        int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }

    }    
    
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }    
    }
}    

