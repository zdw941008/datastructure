package demo4_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by zdw
 * 2020-02-04 10:05.
 */
public class BucketSort {

    public static void main(String[] args) {
        int[] arr = {3,4,2,6,8,1,10};
        bucketSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void bucketSort(int[] arr){
        //细节，最大值赋初值取反
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }

        //创建桶   公式
        int bucketNum = (max-min)/arr.length+1;
        ArrayList<ArrayList<Integer>> bucketArr = new ArrayList<>(bucketNum);

        for(int i = 0; i < bucketNum; i++){
            bucketArr.add(new ArrayList<Integer>());
        }
        //将每个元素放入桶
        for(int i=0;i<arr.length;i++){
            int num = (arr[i] - min) / (arr.length);
            System.out.println("num:"+num);
            bucketArr.get(num).add(arr[i]);
        }

        //对每个桶进行排序
        for(int i = 0; i < bucketArr.size(); i++){
            Collections.sort(bucketArr.get(i));
        }

        //把桶中的元素取出放回原数组中
        int index=0;
        for (ArrayList<Integer> integers : bucketArr) {
            for (Integer integer : integers) {
                arr[index]=integer;
                index++;
            }
        }
    }


}
