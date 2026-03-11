package Sorting;

public class MergeSort {
    public static void main(String args[]){
        int arr[]={10,1234,9,7234,67,9181,733,197,7,3};
        int size=arr.length;
        for(int nums:arr){
            System.out.print(" "+nums);
        }

        System.out.println("");
        mergedSort(arr,0,size-1);
        
        for(int nums:arr){
            System.out.print(" "+nums);
        }

    }

    private static void mergedSort(int[] arr, int left, int right){
        if(left<right){
            int midpoint=(left+right)/2;
            mergedSort(arr,left,midpoint);
            mergedSort(arr,midpoint+1,right);

            MergedData(arr,left,midpoint ,right);
        }
    }

    private static void MergedData(int[] arr, int left, int midpoint, int right) {
        int n1=midpoint-left+1;
        int n2=right-midpoint;
        int left2[]=new int[n1];
        int right2[]=new int[n2];

        for(int i=0;i<n1;i++){
            left2[i]=arr[left+i];   //copying the left data in the new arr
        }

        for(int j=0;j<n2;j++){
            right2[j]=arr[midpoint+1+j];    //copying the right data in the new arr
        }

        int i=0,j=0;
        int k=left;
        while(i<n1 && j<n2){
            if(left2[i]<=right2[j]){
                arr[k]=left2[i];
                i++;
            }
            else{
                arr[k]=right2[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=left2[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k]=right2[j];
            j++;
            k++;
        }
    }
}
