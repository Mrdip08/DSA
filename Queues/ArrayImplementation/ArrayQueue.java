package Queues.ArrayImplementation;

public class ArrayQueue {
    int arr[];
    int size;
    int front;
    int rear;
    public ArrayQueue(int arr[]) {
        this.arr=arr;
        this.size=arr.length;
        this.front=-1;
        this.rear=-1;
    }

    public boolean isFull(){
        return rear==size-1;
    }

    public boolean isEmpty(){
        return front==-1 || front>rear;
    }

    public void inQueue(int data){
        if(front==-1){
            front=0;
        }
        if(isFull()){
            System.out.println("The Queue is OverFlow");
            return;
        }
        else{
            arr[++rear]=data;
            return;
        }
    }

    public void deQueue(){
        if(isEmpty()){
            System.out.println("The Queue is UnderFlow");
            return;
        }
        else{
            front++;
        }
    }

    public void show(){
        System.out.print("The elements in the Queue are=  ");
        for(int i=front;i<=rear;i++){
            System.out.print(" "+arr[i]);
        }
        return;
    }


    
}
