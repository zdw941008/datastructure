package hellow;

/**  排序的二维数组中找一个数
 * Created by zdw
 * 2019-11-20 20:05.
 */
public class Test02 {

    public static void main(String[] args) {
        int array[][] = {{}};

        find2(16,array);

//        16,[[]]    考虑空值


    }

    // 暴力破解法
    public static boolean find(int target,int[][] arr){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
//                System.out.println(arr[i][j]);
                if (arr[i][j]==target){
                    System.out.println(target);
                }
            }
        }
        return true;
    }


    //从上至下移动行，比他大就继续下移，比他小就行内找

    public static boolean find2(int target,int[][] array){
        int i=0;
        while (i<array.length){
            int length = array[i].length;
            if (length==0){
                return false;
            }
//            System.out.println(arr[i][length-1]);
            // 行内找
            if (target==array[i][length-1]){
                return true;
            }

            if (target<array[i][length-1]){
                for (int j=0 ;j<length;j++){
                    if (target==array[i][j]){
                        System.out.println(target);
                        return true;
                    }
                }
            }
            i++;
        }
        return false;
    }
}
