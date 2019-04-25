package demo3;

/**
 * Created by zdw
 * 2019-04-17 14:21.
 */
public class TestFebonacci {

    public static void main(String[] args) {
        System.out.println(febonacci(6));

    }

    public static int febonacci(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else {
            return febonacci(i - 1) + febonacci(i - 2);
        }

    }


}
