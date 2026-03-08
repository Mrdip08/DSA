package Sorting;

public class QuickSort {
    public static void main(String args[]){
        int arr[]={10,1234,9,7234,67,9181,733,197,7,3};
        int size=arr.length;

        for(int nums:arr){
            System.out.print(" "+nums);
        }
        System.out.println();
        
        quickSort(arr,0,size-1);

        for(int nums:arr){
            System.out.print(" "+nums);
        }
        System.out.println();
    }

    private static void quickSort(int arr[], int low, int high) {
        if(low<high){
            int par= partation(arr,low,high);
            quickSort(arr,low,par-1);
            quickSort(arr,par+1,high);
        }
    }

    private static int partation(int[] arr, int low, int high) {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
}

