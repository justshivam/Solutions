// Author: @justshivam

class Tree
{ 
    Node prev=null;
    Node bTreeToClist(Node root)
    {
        //your code here
        if(root==null) return root;
        root = DLL(root);
        Node temp = root;
        while(temp.right!=null){
            temp = temp.right;
        }
        temp.right = root;
        root.left = temp;
        return root;
    }
    Node DLL(Node root){
        if(root==null) return root;
        Node head = DLL(root.left);
        if(prev==null){
            head = root;
        }else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        DLL(root.right);
        return head;
    }
    
}
