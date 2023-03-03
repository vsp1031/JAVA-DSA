public class insersectionsort {
    public static void main(String args[]){
        int arr[]={9,3,8,2,7,1,6,4,5};
        insersectionsort(arr);
        printArray(arr);

    }
    public static void insersectionsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }                
            arr[prev+1]=curr;

        }

    }
    
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }    

    
}
