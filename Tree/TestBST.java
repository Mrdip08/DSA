package Tree;

public class TestBST {
    public static void main(String args[]) { 
       BinarySearchTree bi=new BinarySearchTree();
        bi.insert(15);
        bi.insert(10);
        bi.insert(2);
        bi.insert(7);
        bi.insert(16);
        System.out.println("Sorted tree");
        bi.inOrder(bi.root);
        System.out.println("");
        bi.preOrder(bi.root);
        System.out.println("");
        bi.postOrder(bi.root);
        bi.search(20);
    }
    
}
