package LinkedList.SinglyCircularLinkedList;
import LinkedList.SinglyLinkedList.Node;

public class SCircularList {
    Node head=null;
    Node tail=null;

    public boolean isEmpty(){
        return head==null && tail==null;
    }

    public void addTail(int data){
        Node n=new Node(data);
        if(isEmpty()){
            head=tail=n;
            tail.next=head;
        }
        else{
            tail.next=n;
            tail=n;
            tail.next=head;
        }
    }

    public void addHead(int data){
        Node n=new Node(data);
        if(isEmpty()){
            head=tail=n;
            tail.next=head;
        }
        else{
            n.next=head;
            head=n;
            tail.next=head;
        }
    }

    public void addAfter(int after,int data){
        Node n=new Node(data);
        Node temp=head;
        if(isEmpty()){
            head=tail=n;
            tail.next=head;
        }
        else{
            while(temp!=null){
                if(temp.data==after){
                    n.next=temp.next;
                    temp.next=n;
                    if(temp==tail){
                        tail=n;
                        tail.next=head;
                    }
                    break;
                }
                temp=temp.next;
            }
            return;
        }
    }

    public void delHead(){
        if(isEmpty()){
            System.out.println("The list is Empty");
            return;
        }
        if(head==tail){
            head=tail=null;
        }
        else{
            head=head.next;
            tail.next=head;
        }
    }

    public void delTail(){
        Node temp=head;
        if(isEmpty()){
            System.out.println("The list is Empty");
            return;
        }
        if(head==tail){
            head=tail=null;
        }
        else{
            while(temp.next!=head){
                if(temp.next==tail){
                    temp.next=head;
                    tail=temp;
                    break;
                }
                temp=temp.next;
            }
            return;
        }
    }

    public void delAfter(int after){
        Node temp=head;
        if(isEmpty()){
            System.out.println("The List is Empty");
            return;
        }
        else{
            while(temp.next!=head){
                if(temp.data==after){
                    if(temp.next==tail){
                        tail=temp;
                        tail.next=head;
                        return;
                    }
                    temp.next=temp.next.next;
                    break;
                }
                temp=temp.next;
            }
            return;
        }
    }

    public void traverse(){
        if(isEmpty()){
            System.out.println("The list is Empty");
            return;
        }
        Node temp=head;
        do{
            System.out.println(""+temp.data);
            temp=temp.next;
        }while(temp!=head);
    }
}
