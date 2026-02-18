package Stack.ArrayImplementation;
import java.util.Scanner;
public class TestStack {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        ArrayStack as=new ArrayStack(arr);
        as.push(1);
        as.push(2);
        as.push(3);
        as.push(4);
        as.push(5);
        as.peek();
        int popped=as.pop();
        System.out.println("The element that was popped is="+popped);
        as.show();
        sc.close();
    }   
}
