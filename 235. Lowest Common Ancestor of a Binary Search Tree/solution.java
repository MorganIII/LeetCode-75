/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        LinkedList<TreeNode> findP =  new LinkedList<>();
        LinkedList<TreeNode> findQ = new LinkedList<>();
        findP = search(root,p,findP);
        findQ = search(root,q,findQ);
        if(findP.contains(q)){
            return q;
        } else if(findQ.contains(p)){
            return p;
        }
        int i = findP.size()-1;
        int j = findQ.size()-1;
        while(findP.get(i) == findQ.get(j) ) {
            i--;
            j--;
        }
        return findP.get(i+1);
    }
    public LinkedList<TreeNode> search(TreeNode root,TreeNode node , LinkedList<TreeNode> findNode) {
        findNode.addFirst(root);
        if(root.val == node.val) {
            return findNode;
        }
        if(root.val < node.val) {
            search(root.right,node,findNode);
        }
        else {
            search(root.left,node,findNode);
        }

        return findNode;
        
    }
}
