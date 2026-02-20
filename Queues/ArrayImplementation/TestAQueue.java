package Queues.ArrayImplementation;
import java.util.Scanner;
public class TestAQueue {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        ArrayQueue aq=new ArrayQueue(arr);
        aq.inQueue(2);
        aq.inQueue(3);
        aq.inQueue(4);
        aq.inQueue(5);
        aq.deQueue();
        aq.deQueue();
        aq.show();

    }
    
}
