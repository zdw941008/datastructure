package demo1;

import java.util.Arrays;

/**
 * Created by zdw
 * 2019-04-13 15:33.
 */
public class TestBinarySearch {

    public static void main(String[] args) {
        //目标数组
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        //目标元素
        int target = 3;
        //开始位置
        int begin = 0;
        //结束位置
        int end = arr.length-1;
        //记录中间位置
        int mid = (begin+end)/2;
        System.out.println(mid);
        //记录目标位置
        int index=-1;
        System.out.println("begin:"+begin);
        System.out.println("mid:"+mid);
        System.out.println("end:"+end);
        while (true){
            //判断中间的这个元素是不是要查找的元素
            if(arr[mid]==target){
                index=mid;
                break;
            //中间这个元素不是要查找的元素
            }else {
                //判断中间的这个元素是不是比目标元素大
                if(arr[mid]>target){
                    //把结束位置调整到中间位置前的一个位置
                    end=mid-1;
                //中间的这个元素比目标元素更小
                }else {
                    //把开始位置调整到中间位置的后一个位置
                    begin = mid +1;
                }
                //取出新的中间位置
                mid=(begin+end)/2;
                System.out.println("----");
                System.out.println("begin:"+begin);
                System.out.println("mid:"+mid);
                System.out.println("end:"+end);
            }

        }

        System.out.println("index:"+index);


    }



}
