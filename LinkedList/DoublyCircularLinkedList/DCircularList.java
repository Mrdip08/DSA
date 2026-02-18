package LinkedList.DoublyCircularLinkedList;
import LinkedList.DoublyLinkedList.Node;

public class DCircularList {
    Node head=null;
    Node tail=null;

    public boolean isEmpty(){
        return head==null &&tail==null;
    }

    public void addTail(int data){
        Node n=new Node(data);
        if(isEmpty()){
            head=tail=n;
            tail.next=head;
            head.prev=tail;
        }
        else{
            tail.next=n;
            n.prev=tail;
            tail=n;
            tail.next=head;
            head.prev=tail;
        }
    }

    public void addHead(int data){
        Node n=new Node(data);
        if(isEmpty()){
            head=tail=n;
            tail.next=head;
            head.prev=tail;
        }
        else{
            n.next=head;
            head.prev=n;
            head=n;
            head.prev=tail;
            tail.next=head;
        }
    }

    public void addAfter(int after,int data){
        Node n=new Node(data);
        if(isEmpty()){
            head=tail=n;
            tail.next=head;
            head.prev=tail;
        }
        else{
            Node temp=head;
            do{
                if(temp.data==after ){
                    n.next=temp.next;
                    n.prev=temp;
                    temp.next.prev=n;
                    temp.next=n;
                    if(temp==tail){
                        tail=n;
                    }
                    tail.next=head;
                    head.prev=tail;
                    return;
                }
                temp=temp.next;
                
            }while(temp!=head);
                
        }
    }

    public void delHead(){
        if(isEmpty()){
            System.out.println("The list is Empty");
            return;
        }
        if(head==tail){
            head=tail=null;
            return;
        }
        else{
            head=head.next;
            head.prev=tail;
            tail.next=head;
        }
        return;
    }

    public void delTail(){
        Node temp=head;
        if(isEmpty()){
            System.out.println("The list is Empty");
            return;
        }
        if(head==tail){
            head=tail=null;
            return;
        }
        while(temp.next!=tail){
            temp=temp.next;
        }
        tail=temp;
        tail.next=head;
        head.prev=tail;
    }

    public void delAfter(int after){
        Node temp=head;
        if(isEmpty()){
            System.out.println("The list is Empty");
            return;
        }
        else{
            while(temp!=null && temp.next!=null){
                if(temp.data==after){
                    if(temp.next==tail){
                        tail=temp;
                        temp.next=null;
                        return;
                    }
                    temp.next=temp.next.next;
                    temp.next.prev=temp;
                    return;
                }
                temp=temp.next;
            }
        }
    }

    public void traverse(){
        Node temp=head;
        Node temp2=tail;
        while(temp!=null){
            System.out.print(" "+temp.data);
            temp=temp.next;
        }
        System.out.println("");
        while(temp2!=null){
            System.out.print(" "+temp2.data);
            temp2=temp2.prev;
        }
    }
}
