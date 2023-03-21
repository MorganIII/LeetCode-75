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
    public boolean isValidBST(TreeNode root) {
    double pInf = Double.POSITIVE_INFINITY;
    double nInf = Double.POSITIVE_INFINITY * -1;
    return validate(root , nInf, pInf);   
    }
    public boolean validate(TreeNode root , double leftBoundary, double rightBoundary) {
        if(root == null) {
            return true;
        }
        if(!(root.val > leftBoundary && root.val < rightBoundary)){
            return false;
        }
        boolean left =  validate(root.left, leftBoundary, root.val);
        boolean right = validate(root.right, root.val, rightBoundary);

        return left && right;
    }
}