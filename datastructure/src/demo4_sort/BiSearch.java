package demo4_sort;

/**
 * Created by zdw
 * 2019-11-12 19:27.
 */
public class BiSearch {

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};

        biSearch(arr, 4);

    }

    public static void biSearch(int[] arr, int n) {

        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        while (arr[mid] != n) {
            if (arr[mid] < n) {
                start = mid;
                mid = (start + end) / 2;
            } else {
                end = mid;
                mid = (start + end) / 2;
            }
        }

        System.out.println("mid:" + mid);
        System.out.println(arr[mid]);
    }


}
