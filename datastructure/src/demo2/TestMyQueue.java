package demo2;

/**
 * Created by zdw
 * 2019-04-15 16:20.
 */
public class TestMyQueue {

    public static void main(String[] args) {
        MyQueue mq = new MyQueue();

        mq.add(3);
        mq.add(1);
        mq.add(2);


        System.out.println(mq.poll());


    }


}
