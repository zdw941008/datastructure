package demo13;

/**
 * Created by zdw
 * 2019-04-29 14:50.
 */
public class StuInfo {

    private int age;
    private int count;

    public StuInfo(int age) {
        this.age = age;
    }

    public StuInfo(int age, int count) {
        this.age = age;
        this.count = count;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    /**
     * 散列函数
     *
     * @return
     */
    public int hashCode() {
        return age % 10;
    }

    @Override
    public String toString() {
        return "StuInfo{" +
                "age=" + age +
                ", count=" + count +
                '}';
    }
}
