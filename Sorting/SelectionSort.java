package Sorting;

public class SelectionSort {
    public static void main(String args[]){
        int arr[]={5,6,8,9,14,2,10};
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
