package leetcode.zj.com.lettcodealgorithm;

/*
    将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。

    本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。

    示例:

    给定有序数组: [-10,-3,0,5,9],

    一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：

          0
         / \
       -3   9
       /   /
     -10  5

    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class No_108_将有序数组转换为二叉搜索树 {

    /**
     * @param args
     */
    public static void main(String[] args) {

    }

    /**
     * Definition for a binary tree node.
     *
     * public class TreeNode {
     *  int val;
     *  TreeNode left;
     *  TreeNode right;
     *  TreeNode(int x) {
     *     val = x;
     *  }
     * }
     *
     */
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //  二叉搜索树的特点：
    //    1.二分搜索树是二叉树；
    //    2.二分搜索树每个节点的值：
    //      a.大于其左子树所有节点的值；
    //      b.小于其右子树所有节点的值；
    //    3.每一棵子树也是二分搜索树；
    public static TreeNode sortedArrayToBST(int[] nums) {

        if (null != nums) {

        }

        return null;
    }

}
