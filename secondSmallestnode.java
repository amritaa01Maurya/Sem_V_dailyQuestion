package dailyquestions;

public class secondSmallestnode {
   
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        
        public int secondMinimumValue(TreeNode root, TreeNode node) {
            if(node == null){
                return -1;
            }
            if(node.val > root.val){
                return node.val;
            }
            int left = secondMinimumValue(root, node.left);
            int right = secondMinimumValue(root, node.right);
            if(left == -1){
                return right;
            }
            if(right == -1){
                return left;
            }
            return Math.min(left, right);
        }
        public int findSecondMinimumValue(TreeNode root) {
            if(root == null){
                return -1;
            }
            TreeNode node = root;
            return secondMinimumValue(root, node);
        }
    }
}
