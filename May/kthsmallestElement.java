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
class MinKthElement {
    public void inorder(TreeNode root,ArrayList<Integer> ls){
        if(root!=null){
            inorder(root.left,ls);
            ls.add(root.val);
            inorder(root.right,ls);
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> lst = new ArrayList<>();
        inorder(root,lst);
        return lst.get(k-1);
    }
}