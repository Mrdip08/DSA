package Sorting;

public class SelectionSort {
    public static void main(String args[]){
        int arr[]={10,1234,9,7234,67,9181,733,197,7,3};
        int size=arr.length;
        
        for(int nums:arr){
            System.out.print(" "+nums);
        }
        System.out.println();

        System.out.println();
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
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
