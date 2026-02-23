package Tree;

public class BinarySearchTree {
    Node root;
    BinarySearchTree(){
        this.root=null;
    }
    public Boolean isEmpty(){
        return root==null;
    }

    public void insert(int data){
        Node n=new Node(data);
        if(isEmpty()){
            root=n;
        }
        else{
            Node temp=root;
            while(true){
                if(data<temp.data){
                    if(temp.left==null){
                        temp.left=n;
                        return;
                    }
                    else{
                        temp=temp.left;
                    }
                }
                if(data>temp.data){
                    if(temp.right==null){
                        temp.right=n;
                        return;
                    }
                    else{
                        temp=temp.right;
                    }
                }
            }
        }
    }

    public void search(int key){
        
        if(isEmpty()){
            System.out.println("The tree is Empty");
            return;
        }
        else{
            Node temp=root;
            while(temp!=null){
                if(temp.data==key){
                    System.out.println("The data is in the Tree");
                    return;
                }
               else if(key<temp.data){
                temp=temp.left;
               }
               else{
                temp=temp.right;
               }
            }
             System.out.println("The key data is not in the tree");
        }
    }

    public Node delete(Node root,int data){
        if(isEmpty()){
            System.out.println("The tree is empty");
            return root;
        }
        if(data<root.data){
            root.left=delete(root.left,data);
        }
        else if(data>root.data){
            root.right=delete(root.right, data);
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            if(root.left==null){
                return root.right;
            }
             if(root.right==null){
                return root.left;
            }
           if(root.left != null && root.right != null){
                Node temp = root.right;
                while(temp.left != null){
                     temp = temp.left;
                    }
                 root.data = temp.data;
                 root.right = delete(root.right, temp.data);
            }
        }
        return root;
    }
        
    public void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.println(""+root.data);
            inOrder(root.right);
        }
    }
    public void preOrder(Node root){
        if(root!=null){
            System.out.println(""+root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(""+root.data);
        }
    }
    
}
