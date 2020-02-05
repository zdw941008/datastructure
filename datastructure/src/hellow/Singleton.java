package hellow;

/**
 * Created by zdw
 * 2019-11-09 14:28.
 */
public class Singleton {

    private Singleton() {

    }

    public int a(int an){
        return 1;
    }

    public String a(String an){
        return an;
    }

    static class SingletonHandler {
        private static Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHandler.INSTANCE;
    }


}


//1.spring bean的创建过程
//2.单例模式的运用        v
//3.多线程的具体应用
//4.算法：的分类
//5.String s =new String("2");    v
//6.sql练习
//7.笔试题练习
//8.http
//9.位运算
//10.类的加载顺序
//10.jvm 类加载顺序
//11.for(;;)         v
//12.异常类型
//13.线程池哪几个参数,创建好后有几个线程
//14.学会一个牛逼的排序算法
//15.Math.Round
// 全表搜索
//索引
// sql 语句执行顺序  from where group by   max having select order by
// 数据库有五大约束 (主键约束，唯一约束，检查约束，默认约束，外键约束 );
//转码  utf-8   gbk
// 编码规范


















