package dailyquestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class deleteNodeReturnforest {
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
    public TreeNode deleteHelper(TreeNode root, Set<Integer> del, List<TreeNode> res) {
        if(root == null){
            return null;
        }
        root.left = deleteHelper(root.left, del, res);
        root.right = deleteHelper(root.right, del, res);
        if(del.contains(root.val)){
            if(root.left != null){
                res.add(root.left);
            }
            if(root.right != null){
                res.add(root.right);
            }
            return null;
        }else{
            return root;
        }
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> del = new HashSet<>();
        for(int num: to_delete){
            del.add(num);
        }
        List<TreeNode> res = new ArrayList<>();
        deleteHelper(root, del, res);
        if(!del.contains(root.val)){
            res.add(root);
        }
        return res;
    }
}
}
