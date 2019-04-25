package demo5;

/**
 * Created by zdw
 * 2019-04-22 16:53.
 */
public class TreeNode {
    //节点的权
    int value;
    //左儿子
    TreeNode leftNode;
    //右儿子
    TreeNode rightNode;

    public TreeNode(int value) {
        this.value = value;
    }

    //设置左儿子
    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    //设置右儿子
    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    //前序遍历
    public void frontShow() {
        //先遍历当前节点的内容
        System.out.print(value + " ");
        //左节点
        if (leftNode != null) {
            leftNode.frontShow();
        }
        //右节点
        if (rightNode != null) {
            rightNode.frontShow();
        }
    }

    //中序遍历
    public void midShow() {
        //先遍历左节点
        if (leftNode != null) {
            leftNode.midShow();
        }
        //根节点
        System.out.print(value + " ");
        //右节点
        if (rightNode != null) {
            rightNode.midShow();
        }
    }

    //后序遍历
    public void afterShow() {
        //先遍历左节点
        if (leftNode != null) {
            leftNode.afterShow();
        }
        //右节点
        if (rightNode != null) {
            rightNode.afterShow();
        }
        //根节点
        System.out.print(value + " ");
    }

    //前序查找
    public TreeNode frontSearch(int i) {
        System.out.println("找");
        TreeNode target = null;
        //对比当前节点的值
        if (this.value == i) {
            return this;
            //当前节点的值不是要查找的节点
        } else {
            //查找左儿子
            if (leftNode != null) {
                target = leftNode.frontSearch(i);
            }
            if (target != null) {
                return target;
            }
            if (rightNode != null) {
                target = rightNode.frontSearch(i);
            }
        }
        return target;
    }

    public TreeNode midSearch(int i) {
        System.out.println("找");
        TreeNode target = null;
        if (leftNode != null) {
            target = leftNode.midSearch(i);
        }
        if (target != null) {
            return target;
        }
        if (this.value == i) {
            return this;
            //当前节点的值不是要查找的节点
        }
        if (rightNode != null) {
            target = rightNode.midSearch(i);
        }
        if (target != null) {
            return target;
        }
        return target;
    }

    public TreeNode afterSearch(int i) {
        System.out.println("找");
        TreeNode target = null;
        if (leftNode != null) {
            target = leftNode.afterSearch(i);
        }
        if (target != null) {
            return target;
        }
        if (rightNode != null) {
            target = rightNode.afterSearch(i);
        }
        if (target != null) {
            return target;
        }
        if (this.value == i) {
            return this;
            //当前节点的值不是要查找的节点
        }
        return target;
    }

    //删除一颗子树
    public void delete(int i) {
        TreeNode parent = this;

        //判断左儿子
        if (parent.leftNode != null && parent.leftNode.value == i) {
            parent.leftNode = null;
            return;
        }
        //判断右儿子
        if (parent.rightNode != null && parent.rightNode.value == i) {
            parent.rightNode = null;
            return;
        }
        //递归检查并删除左儿子
        parent = leftNode;
        if (parent != null) {
            parent.delete(i);
        }
        //递归检查并删除右儿子
        parent = rightNode;
        if (parent != null) {
            parent.delete(i);
        }


    }


}
