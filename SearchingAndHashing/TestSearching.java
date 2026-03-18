package SearchingAndHashing;

public class TestSearching {
    public static void main(String args[]){
        int arr[]={10,1234,9,7234,67,9181,733,197,7,3};
        LinearSearch ls=new LinearSearch(arr, 7);
        ls.search();
        BinarySearch bs=new BinarySearch(arr, 7);
        bs.search();
    }
}
