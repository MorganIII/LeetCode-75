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
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> levelList = new ArrayList<>(); 
        if(root == null){
            return list;
        } else if(root.left == null && root.right == null) {
            list.add(Arrays.asList(root.val));
            return list;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int noOfNodes = queue.size();
            for(int i = 0; i < noOfNodes; i++) {
                if(queue.peek().left != null) queue.add(queue.peek().left);
                if(queue.peek().right != null) queue.add(queue.peek().right);
                levelList.add(queue.poll().val);
            }
            list.add(new ArrayList<>(levelList));
            levelList.clear();
    }
    return list;
    }
}