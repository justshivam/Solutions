//Authtor: @justshivam

class Tree
{
    
     /* This function should return tree if passed  tree 
     is balanced, else false. */
    boolean isBalanced(Node root)
    {
	// Your code here
	   int x = balCheck(root);
	   if(x==-1) return false;
	   return true;
    }
    int balCheck(Node root){
        if(root==null) return 0;
        int lh = balCheck(root.left);
        if(lh==-1) return -1;
        int rh = balCheck(root.right);
        if(rh==-1) return -1;
        if(Math.abs(lh-rh)>1) return -1;
        return Math.max(lh,rh)+1;
    }
}