package LinkedList.SinglyCircularLinkedList;

public class TestScl {
    public static void main(String args[]){
        SCircularList scl=new SCircularList();
        scl.addHead(1);
        scl.addHead(0);
        scl.addTail(4);
        scl.addTail(5);
        scl.addAfter(1, 2);
        scl.addAfter(2, 3);
        scl.addAfter(3, 6);
        scl.delAfter(3);
        scl.delHead();
        scl.delTail();
        scl.traverse();
    }
}
