package Sorting;

public class BubbleSort { 
    public static void main(String args[]){
        int arr[]={10,1234,9,7234,67,9181,733,197,7,3};
        int size=arr.length;

        for(int nums:arr){
            System.out.print(" "+nums);
        }
        System.out.println();

        System.out.println();
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            for(int nums:arr){
            System.out.print(" "+nums);
        }
        System.out.println();
        }

        System.out.println();
        for(int nums:arr){
            System.out.print(" "+nums);
        }
    }
}

