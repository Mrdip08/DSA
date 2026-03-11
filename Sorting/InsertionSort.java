package Sorting;

public class InsertionSort {
    public static void main(String args[]){
        int arr[]={10,1234,9,7234,67,9181,733,197,7,3};
        int size=arr.length;

        for(int nums:arr){
            System.out.print(" "+nums);
        }
        System.out.println();

        for(int i=1;i<size;i++){
            int key=arr[i];
            int j;
            for(j=i-1;j>=0 && arr[j]>key;j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=key;

            System.out.println();
            for(int nums:arr){
            System.out.print(" "+nums);
            
        }
        }   

        System.out.println();
        System.out.println();
        for(int nums:arr){
            System.out.print(" "+nums);
        }

        
    }
    
}
