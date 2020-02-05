package demo4_sort;

import java.util.Arrays;

/**
 *
 *
 *
 *
 *
 * 插入排序
 *
 * Created by zdw
 * 2019-04-21 16:58.
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 2, 8, 5, 9, 1, 0};
        insertSort(arr);
//        System.out.println(Arrays.toString(arr));
    }

    //插入排序
    //  #万一没有
    private static void insertSort(int[] arr) {
        System.out.println(Arrays.toString(arr));
        //遍历所有的数字
        for (int i = 1; i < arr.length; i++) {

            //插入的数
            int insertVal = arr[i];
            System.out.println("insertVal:"+insertVal);
            //被插入的位置,前一个数的位置
            int index = i-1;

            //如果插入的数比被插入的数小  ，放到最前面
            while (index>=0 && insertVal<arr[index]){

                //将被插数大的一直往后挪
                arr[index+1] = arr[index];
                //index减到-1为止
                index--;

            }

            arr[index+1]=insertVal;
            System.out.println(Arrays.toString(arr));
        }
    }


}
