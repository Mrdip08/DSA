package LinkedList.DoublyLinkedList;

public class TestDLL {
    public static void main(String args[]){
        DLinkedList dll=new DLinkedList();
        dll.addHead(1);
        dll.addHead(0);
        dll.addTail(4);
        dll.addTail(5);
        dll.addAfter(1, 2);
        dll.addAfter(2, 3);
        dll.addAfter(3, 6);
        dll.delAfter(3);
        dll.delHead();
        dll.delTail();
        dll.traverse();
    }
    
}
