package Sorting;

public class InsertionSort {
    public static void main(String args[]){
        int arr[]={5,6,8,9,14,2,10};
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
