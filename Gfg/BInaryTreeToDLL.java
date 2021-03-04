// Author: @justshivam

class GfG
{
    Node prev = null;
    Node bToDLL(Node root)
    {
	//  Your code here	
	if(root==null) return root;
	Node head = bToDLL(root.left);
	if(prev==null){
	    head = root;
	}
	else{
	    root.left = prev;
	    prev.right = root;
	}
	prev=root;
	bToDLL(root.right);
	return head;
    }
}
