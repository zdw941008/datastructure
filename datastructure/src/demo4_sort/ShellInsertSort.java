package demo4_sort;

import java.util.Arrays;

/**
 * Created by zdw
 * 2020-02-03 16:08.
 */
public class ShellInsertSort {

    public static void main(String[] args) {

        int[] arr = {3,4,2,6,8,1,10};

        shellSort(arr);


        System.out.println(Arrays.toString(arr));

    }


    private static void shellSort(int[] arr){

        int dk = arr.length/2;

        while (dk>=1){
            insertSort(arr,dk);
            dk = dk/2;
        }


    }

    //插入排序
    private static void insertSort(int[] arr,int dk) {
        //对每一个组进行了直接插入排序
        //遍历所有的数字
        for (int i = dk; i < arr.length; i++) {
            //这个判断相等于分组
            if(arr[i]<arr[i-dk]){
                //被插入的位置,前一个数的位置
                int index = i-dk;
                //插入的数
                int insertVal = arr[i];

                //交换位置
                arr[i]=arr[i-dk];


                //如果插入的数比被插入的数小  ，放到最前面
                while (index>=0 && insertVal<arr[index]){

                    //将被插数大的一直往后挪,挪dk步长
                    arr[index+dk] = arr[index];
                    //index减到-1为止
                    index=index-dk;

                }
                //插入指定位置
                arr[index+dk]=insertVal;

            }

        }
    }




}
