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
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode node= null;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);

        while(q.size()>0){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                
                if(temp.right!=null) q.add(temp.right);
                if(temp.left!=null) q.add(temp.left);
                TreeNode left = temp.left;
                temp.left= temp.right;
                temp.right= left;
                
                
            }
        }
        return root;
        
    }
}