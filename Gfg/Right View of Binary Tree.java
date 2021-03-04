// Author: @justshivam

class Tree{
    ArrayList<Integer> rightView(Node root) {
        //add code here.
         ArrayList<Integer> arr = new ArrayList<>();
      if(root==null) return arr;
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      while(!q.isEmpty()){
          int size = q.size();
          for(int i=0;i<size;i++){
              Node curr = q.poll();
              if(i==size-1){
                  arr.add(curr.data);
              }
              if(curr.left!=null) q.add(curr.left);
              if(curr.right!=null) q.add(curr.right);
          }
      }
      return arr;
    }
}
