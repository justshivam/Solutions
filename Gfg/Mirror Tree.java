// Author: @justshivam

class Tree
{
    void mirror(Node root)
    {
	    // Your code here
	    if (root == null) 
            return;
    else
    {
        Node temp;
         
        /* Recur for subtrees */
        mirror(root.left);
        mirror(root.right);
     
        /* swap the pointers in this node */
        temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
    }
}
