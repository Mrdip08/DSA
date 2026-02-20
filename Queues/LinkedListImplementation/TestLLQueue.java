package Queues.LinkedListImplementation;
public class TestLLQueue {
    public static void main(String args[]){
        LinkedListQueue llq=new LinkedListQueue();
        llq.inQueue(2);
        llq.inQueue(3);
        llq.inQueue(4);
        llq.inQueue(5);
        int data=llq.peek();
        System.out.println("The front data is= "+data);
        llq.deQueue();
        llq.show();
    }
    
}
