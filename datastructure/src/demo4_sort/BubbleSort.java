package demo4_sort;

import java.util.Arrays;

/**
 * Created by zdw
 * 2019-04-17 15:36.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[]{7, 8, 9, 10, 1, 4, 3, 5};
        bubbleSort(arr);
        descbubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] descbubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    //7 8 9 1 4 3 5 10     n-1 次循环 n-1-i次比较
    //7 8 1 4 3 5 9 10
    //7 1 4 3 5 8 9 10
    //1 4 3 5 7 8 9 10
    //1 3 4 5 7 8 9 10
    //1 3 4 5 7 8 9 10
    //1 3 4 5 7 8 9 10
    //1 3 4 5 7 8 9 10

    //正序
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }


}
