package demo13;

/**
 * Created by zdw
 * 2019-04-29 14:52.
 */
public class TestHashTable {

    public static void main(String[] args) {
        StuInfo s1 = new StuInfo(16, 3);
        StuInfo s2 = new StuInfo(17, 3);
        StuInfo s3 = new StuInfo(18, 3);
        StuInfo s4 = new StuInfo(19, 3);
        StuInfo s5 = new StuInfo(20, 3);

        HashTable ht = new HashTable();
        ht.put(s1);
        ht.put(s2);
        ht.put(s3);
        ht.put(s4);
        ht.put(s5);

        //想要获取的目标数据
        StuInfo target = new StuInfo(18);
        StuInfo info = ht.get(target);
        System.out.println(info);

    }
}
