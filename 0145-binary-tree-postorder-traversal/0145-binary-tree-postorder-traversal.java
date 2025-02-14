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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer>list=new ArrayList<>();
        postorder(root,list);
        return list;
    }
    void postorder(TreeNode node,ArrayList<Integer>list){
        if(node==null) return;
        postorder(node.left,list);
        postorder(node.right,list);
        list.add(node.val);
    }
}