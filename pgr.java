package assignment;

class Solution {
    public int maxDepth(TreeNode root) {
        // Base Condition
        if (root == null) return 0;
        // Hypothesis
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        // Induction
        return Math.max(left, right) + 1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}





public class pgr {
	public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(6);

        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Call the maxDepth method to find the maximum depth of the binary tree
        int depth = solution.maxDepth(root);

        // Print the result
        System.out.println("Maximum Depth of the Binary Tree: " + depth);
    }
}








