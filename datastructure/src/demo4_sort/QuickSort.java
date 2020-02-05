package demo4_sort;

import java.util.Arrays;

/**
 * 开始   3 为标准数stard
 * <p>
 * 右边下标移动   右边结束了， 左边动
 * 左边下标移动   左边结束了， 回到大循环，右边又接着动
 * <p>
 * 3  5  7  8  9   5  1  2  6
 * 0                       0
 * 右边动
 * 3  5  7  8  9   5  1  2  6
 * 0                     0
 * 高位赋值给低位                  2->3
 * 2  5  7  8  9   5  1  2  6
 * 0                     0
 * 左边动
 * 2  5  7  8  9   5  1  2  6
 * 0                  0
 * 低位赋值给高位                   5->2
 * 2  5  7  8  9   5  1  5  6
 * 0                  0
 * 右边动
 * 2  5  7  8  9   5  1  5  6
 * 0               0
 * 高位赋值给低位                    1->5
 * 2  1  7  8  9   5  1  5  6
 * 0               0
 * 左边动
 * 2  1  7  8  9   5  1  5  6
 * 0            0
 * 低位赋值给高位                    7->1
 * 2  1  7  8  9   5  7  5  6
 * 0            0
 * 右边动  。高低合并
 * 2  1  7  8  9   5  7  5  6
 * 00
 * 赋标准值
 * 2  1  3  8  9   5  7  5  6
 * 00
 * <p>
 * <p>
 * Created by zdw
 * 2019-04-17 16:14.
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 6, 7, 1, 7, 2, 8, 0};
        qucikSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }


    private static void qucikSort(int[] arr, int start, int end) {

        //把数组中的第0个数字做为标准数

        //记录需要拍下的下标

        int stard = arr[start];

        int low = start;

        int high = end;

        // 循环找比标准数大的数和比标准数小的数

        if (start < end) {
            while (low < high) {
                //右边(高位)的数字比标准数大，移动下标
                while (arr[high] >= stard && low < high) {
                    high--;
                }
                //使用右边的数字替换左边的数字
                arr[low] = arr[high];
                //如果左边的数字比标准数小,移动下标
                while (arr[low] <= stard && low < high) {
                    low++;
                }
                //使用左边的数字替换右边的数字
                arr[high] = arr[low];
            }

            //把标准数赋给低所在的位置的元素
            arr[low] = stard;
            //递归排序左边的   ,修改了start ,end的值，与上面if start end 判断呼应
            qucikSort(arr, start, low);
            //递归排序右边的
            qucikSort(arr, low + 1, end);

        }
    }


//    private static void qucikSort(int[] arr, int start, int end) {
//        if (start < end) {
//            //把数组中的第0个数字作为标准数
//            int stard = arr[start];
//            //记录需要排序的下标
//            int low = start;
//            int high = end;
//            //循环找比标准数大的数和比标准数小的数
//            while (low < high) {
//                //右边的数字比标准数大
//                while (low < high && stard <= arr[high]) {
//                    high--;
//                }
//                //使用右边的数替换左边的数
//                arr[low] = arr[high];
//                //如果左边的数字比标准数小
//                while (low < high && arr[low] <= stard) {
//                    low++;
//                }
//                arr[high] = arr[low];
//            }
//            //把标准数赋给低所在的位置的元素
//            arr[low] = stard;
//            //处理所有的小的数字
//            qucikSort(arr, start, low);
//            //处理所有大的数字
//            qucikSort(arr, low + 1, end);
//        }
//    }
}
