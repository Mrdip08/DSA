package LinkedList.DoublyLinkedList;

public class DLinkedList {
    Node head=null;
    Node tail=null;

    public boolean isEmpty(){
        return head==null &&tail==null;
    }

    public void addTail(int data){
        Node n=new Node(data);
        if(isEmpty()){
            head=tail=n;
        }
        else{
            tail.next=n;
            n.prev=tail;
            tail=n;
        }
    }

    public void addHead(int data){
        Node n=new Node(data);
        if(isEmpty()){
            head=tail=n;
        }
        else{
            n.next=head;
            head.prev=n;
            head=n;
        }
    }

    public void addAfter(int after,int data){
        Node n=new Node(data);
        if(isEmpty()){
            head=tail=n;
            return;
        }
        else{
            Node temp=head;
            while(temp!=null){
                if(temp.data==after){
                    n.next=temp.next;
                    n.prev=temp;
                    if(temp==tail){
                        tail=n;
                    }
                    else{
                        temp.next.prev=n;
                    }
                    temp.next=n;
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
            return;
        }
        else{
            head=head.next;
            head.prev=null;
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
        temp.next=null;
        tail.prev=null;
        tail=temp;
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
                        tail.prev=null;
                        tail=temp;
                        tail.next=null;
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
