// Author: @justshivam

class GfG {
    public static Tree convert(Node head, Tree node) {
        // add code here.
        if(head==null) return node;
       Queue<Tree> q = new LinkedList<>();
       node = new Tree(head.data);
       q.add(node);
       while(head.next!=null){
           Tree curr = q.poll();
           if(head.next!=null){
               curr.left =new Tree(head.next.data);
               q.add(curr.left);
               head = head.next;
           }
           if(head.next!=null){
               curr.right = new Tree(head.next.data);
               q.add(curr.right);
               head = head.next;
           }
       }
       return node;
    }   
}    
