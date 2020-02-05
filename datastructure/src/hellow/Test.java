package hellow;

/**
 * Created by zdw
 * 2019-04-12 13:52.
 */
public class Test {

    public static void main(String[] args) {
//        Map<String,Integer> map = new HashMap();
//
//        map.put("a",1);
//        map.put("b",1);
//        map.put("c",1);
//
//        //遍历key
//        for (String key : map.keySet()) {
//            System.out.println(key);
//        }
//
//        //遍历value
//        for (Integer value : map.values()) {
//            System.out.println(value);
//        }
//        //map的遍历
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            entry.getKey();
//            entry.getValue();
//        }
//
//        //声明长度
////        int[] arr = new int[10];
//        //直接赋值
//        int[] arr =  {1,2,3};

        Singleton singleton = Singleton.getInstance();


        System.out.println(Math.round(-11.4));

        System.out.println(-11.4+0.5);

    }


}
