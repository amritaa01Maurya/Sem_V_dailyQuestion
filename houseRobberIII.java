package dailyquestions;

import java.util.HashMap;
import java.util.Map;

public class houseRobberIII {
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
        Map<TreeNode, Integer> map = new HashMap<>();
        public int dfs(TreeNode root) {
            if(root == null){
                return 0;
            }
            if(map.containsKey(root)){
                return map.get(root);
            }

            int take = root.val + (root.left == null ? 0 : dfs(root.left.left) + dfs(root.left.right)) + (root.right == null ? 0 : dfs(root.right.left) + dfs(root.right.right));
            int skip = dfs(root.left) + dfs(root.right);
            int res = Math.max(take, skip);
            map.put(root, res);
            return res;
        }

        public int rob(TreeNode root) {
            if(root == null){
                return 0;
            }
            return dfs(root);
        }
    }
}