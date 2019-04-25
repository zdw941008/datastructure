package demo6;

/**
 * Created by zdw
 * 2019-04-23 14:45.
 */
public class TestArrayBinaryTree {


    //2*index+1
    //2*index+2
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7};
        ArrayBinaryTree tree = new ArrayBinaryTree(data);
        tree.frontShow(0);

    }

}
