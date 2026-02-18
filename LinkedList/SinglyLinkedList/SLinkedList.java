package LinkedList.SinglyLinkedList;

public class SLinkedList {
    public Node head=null;
    public Node tail=null;

    public boolean isEmpty(){
        return head==null && tail==null;
    }

    public void addTail(int data){
        Node n=new Node(data);
        if(isEmpty()){
            head=tail=n;
        }
        else{
            tail.next=n;
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
            head=n;
        }
    }

    public void addAfter(int after,int data){
        Node n=new Node(data);
        Node temp=head;
        if(isEmpty()){
            head=tail=n;
        }
        else{
            while(temp!=null){
                if(temp.data==after){
                    n.next=temp.next;
                    temp.next=n;
                    if(temp==tail){
                        tail=n;
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
            while(temp.next!=null){
                if(temp.next==tail){
                    temp.next=null;
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
            while(temp!=null && temp.next!=null){
                if(temp.data==after){
                    if(temp.next==tail){
                        tail=temp;
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
        Node temp=head;
        while(temp!=null){
            System.out.println(""+temp.data);
            temp=temp.next;
        }
    }

   
    
}
