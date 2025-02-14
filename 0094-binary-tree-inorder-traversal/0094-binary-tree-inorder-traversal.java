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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer>list=new ArrayList<>();
        inorder(root,list);
        return list;
        
    }
    void inorder(TreeNode node,List<Integer>list){

        //inorder -> left root right
        if(node==null) return;
        inorder(node.left,list); //left
        list.add(node.val); //root
        inorder(node.right,list);  //right
    }
}