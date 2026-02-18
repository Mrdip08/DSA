package Stack.ArrayImplementation;

public class ArrayStack {
    int arr[];
    int top;
    int size;
    ArrayStack(int arr[]){
        this.arr=arr;
        this.top=-1;
        this.size=arr.length;
    }

    public boolean isFull(){
        return top==size-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public void push(int data){
        if(isFull()){
            System.out.println("Stack OverFlow handel the Exception");
            return;
        }
        else{
            arr[++top]=data;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack UnderFlow handel the Exception");
            return -1;
        }
        else{
            return arr[top--];
        }
        
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("Stack UnderFlow");
        }
        else{
            System.out.println("The top element is= "+arr[top]);
        }
    }

    public void show(){
        if(isEmpty()){
            System.out.println("Stack UnderFlow");
        }
        else{
            System.out.println("The elements are");
            for(int i=0;i<=top;i++){
                System.out.println(" "+arr[i]);
            }
        }
    }
}
