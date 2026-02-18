package Sorting;

public class BubbleSort { 
    public static void main(String args[]){
        int arr[]={5,6,8,9,14,2,10};
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

