package demo5;

/**
 * Created by zdw
 * 2019-04-22 16:49.
 */
public class TestBinaryTree {

    public static void main(String[] args) {
        //创建一颗树
        BinaryTree binTree = new BinaryTree();
        //创建一个根节点
        TreeNode root = new TreeNode(1);
        //把根节点赋值给树
        binTree.setRoot(root);
        //创建两个节点
        TreeNode rootL = new TreeNode(2);
        //把新创建的节点设置为根节点的子节点
        root.setLeftNode(rootL);
        TreeNode rootR = new TreeNode(3);
        root.setRightNode(rootR);
        //为第二层的左节点创建两个子节点
        rootL.setLeftNode(new TreeNode(4));
        rootL.setRightNode(new TreeNode(5));
        //为第二层的右节点创建两个子节点
        rootR.setLeftNode(new TreeNode(6));
        rootR.setRightNode(new TreeNode(7));
        //前序遍历数
        System.out.println("前序遍历：");
        binTree.frontShow();
        System.out.println("");
        //中序遍历
        System.out.println("中序遍历：");
        binTree.midShow();
        System.out.println("");
        //后序遍历
        System.out.println("后序遍历：");
        binTree.afterShow();
        System.out.println("");
        //前序查找
//        ThreadedNode result = binTree.frontSearch(3);
//        System.out.println(result.value);
        //中序查找
//        ThreadedNode result = binTree.midSearch(3);
//        System.out.println(result==rootR);
        //后序查找
//        ThreadedNode result = binTree.afterSearch(6);
//        System.out.println(result==rootL);

        binTree.frontShow();
        System.out.println();
        binTree.delete(2);
        binTree.frontShow();

    }
}
