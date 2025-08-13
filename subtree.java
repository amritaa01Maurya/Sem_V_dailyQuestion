package dailyquestions;

import java.util.*;


public class subtree {
     static class TreeNode {
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

    static class BinaryTree{
        public static TreeNode buildTree(int[] nodes){
            if(nodes.length == 0){
                return null;
            }
            TreeNode node = new TreeNode(nodes[0]);
            Queue<TreeNode> q = new LinkedList<>();
            q.add(node);
            int idx = 1;

            while(!q.isEmpty() && idx < nodes.length){
                TreeNode curr = q.poll();
                if(idx < nodes.length && nodes[idx] != -1){
                    curr.left = new TreeNode(nodes[idx]);
                    q.add(curr.left);
                    idx++;    
                }
                if(idx < nodes.length && nodes[idx] != -1){
                    curr.right = new TreeNode(nodes[idx]);
                    q.add(curr.right);
                    idx++;    
                }
            }

            return node;
        }
    }

     public static boolean isIdentical(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null){ 
            return true;
        }else if(root == null || subRoot == null || root.val != subRoot.val) {
            return false;
        }

        if(!isIdentical(root.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(root.right, subRoot.right)){
            return false;
        }

        return true;
    }

    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null){
            return false;
        }
        if(root.val == subRoot.val){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] supTree = new int[n];
            for (int i = 0; i < supTree.length; i++) {
                supTree[i] = sc.nextInt();
            }
            
            int m = sc.nextInt();
            int[] subTree = new int[m];
            for (int i = 0; i < subTree.length; i++) {
                subTree[i] = sc.nextInt();
            }
            
            BinaryTree tree = new BinaryTree();
            TreeNode root = tree.buildTree(supTree);
            TreeNode subRoot = tree.buildTree(subTree);
            
            System.out.println(isSubtree(root, subRoot));
        }
            
    }

}
