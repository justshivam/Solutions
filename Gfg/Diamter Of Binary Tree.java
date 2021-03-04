// Author: @justshivam

class Tree {
    /* Complete the function to get diameter of a binary tree */
    int res = Integer.MIN_VALUE;
    int diameter(Node root) {
        // Your code here
        int x = height(root);
        return res;
    }
    int height(Node root){
        if(root==null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        res = Math.max(res,1+lh+rh);
        return 1+Math.max(lh,rh);
    }
}
