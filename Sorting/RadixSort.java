package Sorting;

public class RadixSort {
     public static void main(String args[]){
        int arr[]={10,1234,9,7234,67,9181,733,197,7,3};
        int size=arr.length;
        int big=arr[0];

        for(int i=0;i<size;i++){
            if(arr[i]>big){
                big=arr[i];
            }
        }

        for(int nums:arr){
            System.out.print(" "+nums);
        }
        System.out.println();
        
        for(int exp=1;big/exp>0;exp*=10){
            counterSort(arr,exp);
        }
        

        System.out.println();

        System.out.println();
        for(int nums:arr){
            System.out.print(" "+nums);
        }
    }

     private static void counterSort(int arr[], int exp) {
        int n=arr.length;
        int output[]=new int[n];
        int count[]=new int[10];

        for(int i=0;i<n;i++){
            int digit=(arr[i]/exp)%10;  //taking the last digit of every array element to check the position
            count[digit]++;
        }

        for(int i=1;i<10;i++){
            count[i]=count[i]+count[i-1];
        }

        for(int i=n-1;i>=0;i--){
            int digit=(arr[i]/exp)%10;
            output[count[digit]-1]=arr[i];
            count[digit]--;
        }

        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }

     }
}
