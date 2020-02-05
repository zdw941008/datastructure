package demo11;

/**
 * Created by zdw
 * 2019-04-28 14:05.
 */
public class TestBinarySortTree {

    public static void main(String[] args) {
        int[] arr = new int[]{7, 3, 10, 12, 5, 1, 9};
        //创建一颗二叉排序树
        BinarySortTree bst = new BinarySortTree();

        for (int i = 0; i < arr.length; i++) {
            bst.add(new Node(arr[i]));
        }
        //
        bst.midShow();
//        Node node = bst.search(20);
//        System.out.println(node);
        //测试查找父节点
//        Node p1 =  bst.searchParent(3);
//        System.out.println(p1.value);
//        bst.delete(9);
        bst.delete(7);
        bst.midShow();

    }


}
