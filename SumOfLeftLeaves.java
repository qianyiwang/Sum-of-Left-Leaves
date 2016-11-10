public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        
        if(root==null){
            return 0;
        }
        
        if(isLeftLeaf(root.left)){
            sum += root.left.val;
        }
        
        sum += sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        
        return sum;
    }
    
    public boolean isLeftLeaf(TreeNode root){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            return true;
        }
        return false;
    }
}