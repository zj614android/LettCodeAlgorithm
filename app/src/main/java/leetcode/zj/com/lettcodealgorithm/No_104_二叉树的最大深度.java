package leetcode.zj.com.lettcodealgorithm;

//        示例：[ 3,9,20,null,null,15,7 ]
//        给定二叉树 [3,9,20,null,null,15,7]，
//
//                3
//               / \
//              9  20
//                 / \
//                15  7
//
//        返回它的最大深度 3 。
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode-cn.com/problems/maximum-depth-of-binary-tree
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

public class No_104_二叉树的最大深度 {


    public static void main(String[] args) {


        //1.构建树
        TreeNode n_3 = new TreeNode(3);
        TreeNode n_9 = new TreeNode(9);
        TreeNode n_20 = new TreeNode(20);
        TreeNode n_15 = new TreeNode(15);
        TreeNode n_7 = new TreeNode(7);

        n_3.setLeftSubTree(n_9);
        n_3.setRightSubTree(n_20);
        n_20.setLeftSubTree(n_15);
        n_20.setRightSubTree(n_7);

        //2.算高度
        //二叉树的深度应为其左、右子树深度的最大值加1。由此，需先分别求得左、右子树的深度，
        //算法中“访问结点”的操作为：求得左、右子树深度的最大值，然后加1。
        maxDepth(n_3);


    }

    //2.算高度
    //二叉树的深度应为其左、右子树深度的最大值加1。由此，需先分别求得左、右子树的深度，
    //算法中“访问结点”的操作为：求得左、右子树深度的最大值，然后加1。


    /***
     * 算高度：
     *     二叉树的深度应为其左、右子树深度的最大值加1。由此，需先分别求得左、右子树的深度，
     *     算法中“访问结点”的操作为：求得左、右子树深度的最大值，然后加1。
     *
     * @param root
     * @return 一个root返回一个单位常量的高度
     */
    public static int maxDepth(TreeNode root) {
        if (null != root){
            return Math.max(maxDepth(root.leftSubTree),maxDepth(root.rightSubTree)) + 1;
        }

        return 0;
    }

    static class TreeNode {

        //this myselef is root
        int data;
        TreeNode leftSubTree;
        TreeNode rightSubTree;

        public TreeNode(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public TreeNode getLeftSubTree() {
            return leftSubTree;
        }

        public void setLeftSubTree(TreeNode leftSubTree) {
            this.leftSubTree = leftSubTree;
        }

        public TreeNode getRightSubTree() {
            return rightSubTree;
        }

        public void setRightSubTree(TreeNode rightSubTree) {
            this.rightSubTree = rightSubTree;
        }
    }



}
