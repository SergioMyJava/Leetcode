package rangesumbst;

public class Solution {
    int sum = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        rangeSumBSTRecurs(root, L, R);
        return sum;
    }

    public void rangeSumBSTRecurs(TreeNode root, int L, int R) {
        if (root != null){
            if (root.val >= L && root.val <= R) {
                sum += root.val;
            }
            if (root.left != null) {
                rangeSumBSTRecurs(root.left, L, R);
            }
            if (root.right != null) {
                rangeSumBSTRecurs(root.right, L, R);
            }
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}