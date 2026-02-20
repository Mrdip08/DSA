package Queues.LinkedListImplementation;
import LinkedList.SinglyLinkedList.SLinkedList;

public class LinkedListQueue {
    SLinkedList sll=new SLinkedList();
    public void inQueue(int data){
        sll.addTail(data);
        return;
    }

    public void deQueue(){
        if(sll.isEmpty()){
            System.out.println("The LinkedList is Empty");
            return;
        }
        else{
        System.out.println("The removing data is="+sll.head.data);
        sll.delHead();
        return;
        }
    }

    public int peek(){
        if(sll.isEmpty()){
            System.out.println("The LinkedList is Empty");
            return -1;
        }
        else{
            return sll.head.data;
        } 
    }

    public void show(){
        sll.traverse();
        return;
    }
    
}
