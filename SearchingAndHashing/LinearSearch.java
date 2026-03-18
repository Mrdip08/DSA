package SearchingAndHashing;

public class LinearSearch {
    int arr[];
    int size;
    int key;
    public LinearSearch(int arr[],int key) {
        this.arr=arr;
        this.size=arr.length;
        this.key=key;
    }
    public void search(){
        for(int i=0;i<size;i++){
            if(arr[i]==key){
                System.out.println("There is the of key in index no= "+arr[i]);
                return;
            }
        }
        System.out.println("Key data not");
        
    }
     
}
