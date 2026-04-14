package SearchingAndHashing;
import java.util.HashMap;

public class HashingUtilPackage { 
    public static void main(String args[]){
        HashMap<Integer,String> data=new HashMap<>();
        data.put(0,"Supriya");              //data entry method
        data.put(1, "Shraddha");
        data.put(2, "Dipeen");
        System.out.println(""+data.get(0));        //get single data by key
        data.remove(0);                            //remove data by key
        System.out.println(data);                      //print all data
        data.clear();                                  //cleare all data
        System.out.println(data);
    }
}
