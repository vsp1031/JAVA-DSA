

public class trapping {
    public static void main(String args[]){
    int arr[]={4,2,0,6,3,2,5};
    trapping_rainwater(arr);
    }

    public static void trapping_rainwater(int arr[]){
        int n=arr.length;
        //max left
        int leftmax[]=new int[arr.length];
        leftmax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }
        //max right
        int rightmax[]=new int[arr.length];
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i], rightmax[i+1]);
        }

        
        int trapping_rainwater=0;
        int width=1;
        
        //loop
        for(int i=0;i<arr.length;i++){

        //watertlevel =max(left ,right)
        int waterlevel =Math.min(leftmax[i], rightmax[i]);

        //trapping_rainwater=(waterlevel- height)width
        trapping_rainwater+=(waterlevel-arr[i])*width;


        }
        System.out.println(trapping_rainwater);
       


      
    }
}
    

