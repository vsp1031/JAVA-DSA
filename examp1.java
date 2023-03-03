public class examp1 {
    public static void main(String args[]){
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        bubblesort1(arr);
        printArrayy(arr);

    }
    public static void bubblesort1(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                while(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public static void printArrayy(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    
}
