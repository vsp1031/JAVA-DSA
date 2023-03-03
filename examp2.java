public class examp2 {

    public static void main(String args[]){
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        selectionsort2(arr);
        printArrayy(arr);

    }
    public static void selectionsort2(int arr[]){
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
    public static void printArrayy(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
        
}
    
    

