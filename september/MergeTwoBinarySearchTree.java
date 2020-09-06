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
    public void RootNull(TreeNode curr1,ArrayList<Integer> lst){
        if(curr1==null) return;
        RootNull(curr1.left,lst);
        lst.add(curr1.val);
        RootNull(curr1.right,lst);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        TreeNode curr1= root1;
        TreeNode curr2 = root2;
        List<Integer> lst = new ArrayList<>();
        
        ArrayList<Integer> arr1 = new ArrayList<>();
         ArrayList<Integer> arr2 = new ArrayList<>();
        RootNull(curr1,arr1);
        RootNull(curr2,arr2);
        int i=0;
        int j=0;
        while(i<arr1.size()&&j<arr2.size()){
            if(arr1.get(i)<arr2.get(j)){
                lst.add(arr1.get(i++));;
            }
            else   lst.add(arr2.get(j++));
        }
        while(i<arr1.size()){
            lst.add(arr1.get(i++));
        }
         while(j<arr2.size()){
            lst.add(arr2.get(j++));
        }
        return lst;
        
        
    }
}