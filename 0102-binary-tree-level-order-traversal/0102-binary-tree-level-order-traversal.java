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
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>>listolist=new ArrayList<>();
        if(root==null) return listolist;
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root); //inserting the root node first

        while(!q.isEmpty())
        {
            int n=q.size();
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode node=q.poll(); //taking the first element from thr queue
                list.add(node.val);

                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            listolist.add(list);

        }
        return listolist;
       
    }
}