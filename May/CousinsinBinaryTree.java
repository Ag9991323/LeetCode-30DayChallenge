/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class CousinsInBinaryTree {
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null) return false;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        if(root.val==x||root.val==y) return false;
      
        while(q.size()>0){
            int n = q.size();
              TreeNode parentx=null;
              TreeNode parenty=null;
            for(int i=0;i<n;i++){
                TreeNode node =q.poll();
                boolean lefty=false;
                if(node.left!=null){
                    if(node.left.val==x) {parentx=node;
                                          lefty=true;}
                    if(node.left.val==y) {parenty=node;
                                          lefty=true;}
                    q.add(node.left);
    
                }
                if(node.right!=null){
                    if(node.right.val==x) {
                        parentx=node;
                        if(lefty) return false;}
                    if(node.right.val==y) {
                        parenty= node;
                        if(lefty) return false;
                    }
                    
                    q.add(node.right);
                }
                
            }
            if(parentx!=null&&parenty!=null) return true;
            
        }
        return false;
        
    }
}