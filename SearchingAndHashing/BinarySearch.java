package SearchingAndHashing;

public class BinarySearch {
    int arr[];
    int size;
    int key;
    int left;
    int right;
    public BinarySearch(int arr[],int key) {
        this.arr=arr;
        this.size=arr.length;
        this.key=key;
        this.left=0;
        this.right=size-1;
    }
    public void sort(){
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
    }
    public void search(){
        sort();
        int mid;
        while(left<=right){
            mid=(left+right)/2;
            if(arr[mid]==key){
                System.out.println("key found in the index= "+arr[mid]);
                return;
            }
            if(arr[mid]<key){
                left=mid+1;
                mid=(left+right)/2;
            }
            else{
                right=mid-1;
                mid=(left+right)/2;
            }
        }
        System.out.println("ket not found in index= "+-1);

    }
    
}
