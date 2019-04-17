package demo2;

/**
 * Created by zdw
 * 2019-04-15 14:38.
 */
public class TestMyStack {

    public static void main(String[] args) {
        //创建一个栈
        MyStack ms = new MyStack();
        //压入数据
        ms.push(9);
        ms.push(8);
        ms.push(7);
        System.out.println(ms.peek());
        System.out.println(ms.pop());
        System.out.println(ms.peek());
        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms.isEmpty());



    }


}
