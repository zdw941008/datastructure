package hellow;

/**
 * Created by zdw
 * 2019-11-26 10:42.
 */
public class SuixianHua {

    public static void main(String[] args) {
        System.out.println("水仙花数：");

        for (int i = 100; i <= 999; i++) {

            int ge, shi, bai;

            ge = i % 10;
            shi = i / 10 % 10;
            bai = i / 10 / 10 % 10;

            if (i == ge * ge * ge + shi * shi * shi + bai * bai * bai) {
                System.out.println("水仙花数：" + i);
            }
        }
    }


}
