package Stack.LinkedListImplementaion;
import LinkedList.SinglyLinkedList.SLinkedList;

public class LinkedListStack {
    SLinkedList sll=new SLinkedList();
    
    public void push(int data){
        sll.addHead(data);
        return;
    }

    public void pop(){
        sll.delHead();
        return;
    }

    public int peek(){
        if(sll.isEmpty()){
            System.out.println("The linked list is empty");
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
