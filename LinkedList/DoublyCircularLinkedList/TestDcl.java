package LinkedList.DoublyCircularLinkedList;

public class TestDcl {
    public static void main(String args[]){
        DCircularList dcl=new DCircularList();
        dcl.addHead(1);
        dcl.addHead(0);
        dcl.addTail(4);
        dcl.addTail(5);
        dcl.addAfter(1, 2);
        dcl.addAfter(2, 3);
        dcl.addAfter(3, 6);
        dcl.delAfter(3);
        dcl.delHead();
        dcl.delTail();
        dcl.traverse();
    }
    
}
