package Sorting;

public class HeapSort {
    public static void main(String args[]){
        int arr[]={10,1234,9,7234,67,9181,733,197,7,3};
        int size=arr.length;

        for(int nums:arr){
            System.out.print(" "+nums);
        }

        MaxHeapSort(arr,size);
        System.out.println();
        for(int nums:arr){
            System.out.print(" "+nums);
        }
    }

    private static void MaxHeapSort(int[] arr, int size){
        for(int i=size/2-1;i>=0;i--){
            Heapify(arr,size,i);
        }
        for(int i=size-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            Heapify(arr,i,0);
        }
    }

    private static void Heapify(int[] arr,int size,int i) {
        int parentNode=i;
        int left=2*i+1;
        int right=2*i+2;
        
        if(left<size && arr[left]>=arr[parentNode]){
            parentNode=left;
        }

        if(right<size && arr[right]>=arr[parentNode]){
            parentNode=right;
        }

        if(parentNode!=i){
            int temp=arr[i];
            arr[i]=arr[parentNode];
            arr[parentNode]=temp;

            Heapify(arr,size,parentNode);
        }
    }

        
        
    

    
}
