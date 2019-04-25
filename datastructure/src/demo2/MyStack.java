package demo2;

/**
 * Created by zdw
 * 2019-04-15 14:25.
 */
public class MyStack {

    //栈用数组来存储数据
    int[] elements;

    public MyStack() {
        elements = new int[0];
    }

    //压入元素
    public void push(int element) {
        int[] newArr = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        newArr[elements.length] = element;
        elements = newArr;
    }

    //取出栈顶元素
    public int pop() {
        if (elements.length == 0) {
            throw new RuntimeException("栈是空的");
        }
        int element = elements[elements.length - 1];
        int[] newArr = new int[elements.length - 1];
        for (int i = 0; i < elements.length - 1; i++) {
            newArr[i] = elements[i];
        }
        elements = newArr;
        return element;
    }

    //查看栈元素
    public int peek() {
        if (elements.length == 0) {
            throw new RuntimeException("栈是空的");
        }
        return elements[elements.length - 1];
    }

    //判断栈是否为空
    public Boolean isEmpty() {
        return elements.length == 0 ? true : false;
    }


}
