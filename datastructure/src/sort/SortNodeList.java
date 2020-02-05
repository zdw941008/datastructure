package sort;

import demo2.Node;

/**
 * Created by zdw
 * 2020-01-07 13:17.
 * 在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序。
 *
 * 示例 1:
 *
 * 输入: 4->2->1->3
 * 输出: 1->2->3->4
 * 示例 2:
 *
 * 输入: -1->5->3->4->0
 * 输出: -1->0->3->4->
 *
 *
 */
public class SortNodeList {

    public static void main(String[] args) {
        Node head = new Node(4);
        head.append(new Node(3) ).append(new Node(2)).append(new Node(1));

        sortList(head);
    }


    public static Node sortList(Node head) {

        while (head!=null){
            int currentVal = head.data;
            Node node = head.next();

            System.out.println("currentVal："+currentVal);

            if (node!=null){
                int nextVal = node.data;
                System.out.println("nextVal："+nextVal);
            }

            head = node;
        }

        return null;
    }

}


