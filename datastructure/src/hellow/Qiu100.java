package hellow;

/**
 * Created by zdw
 * 2019-11-20 10:33.
 */
public class Qiu100 {


    public static void main(String[] args) {

        double sum = 100, height = 100;

        for (int i = 0; i <= 1; i++) {
            height = height / 2;
            sum = sum + height * 2;
        }
        height = height / 2;
        System.out.println("height:" + height + ", sum:" + sum);


        String s = "";

        System.out.println(s.split(",").length);

    }


}
