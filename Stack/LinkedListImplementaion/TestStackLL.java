package Stack.LinkedListImplementaion;
public class TestStackLL {
    public static void main(String args[]){
        LinkedListStack lls=new LinkedListStack();
        lls.push(2);
        lls.push(3);
        lls.push(4);
        int top=lls.peek();
        System.out.println("The top element is="+top);
        lls.pop();
        top=lls.peek();
        System.out.println("The top element is="+top);
        lls.show();
    }
}
