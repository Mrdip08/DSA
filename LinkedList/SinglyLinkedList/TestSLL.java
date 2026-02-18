package LinkedList.SinglyLinkedList;

public class TestSLL {
    public static void main(String args[]){
        SLinkedList sll=new SLinkedList();
        sll.addHead(1);
        sll.addHead(0);
        sll.addTail(4);
        sll.addTail(5);
        sll.addAfter(1, 2);
        sll.addAfter(2, 3);
        sll.addAfter(3, 6);
        sll.delAfter(3);
        sll.delHead();
        sll.delTail();
        sll.traverse();
    }
    
}
