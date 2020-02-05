package sjms;

/**
 * 单例模式
 * Created by zdw
 * 2019-11-12 14:09.
 */
//public class Singleton {
////
////    Singleton(){
////
////    }
////    static class SingletonHandler{
////        private static Singleton instance = new Singleton();
////    }
////
////    public static Singleton getInstance(){
////        return SingletonHandler.instance;
////    }
////
////}


public class Singleton {

    private volatile static Singleton instance = null;

    Singleton() {

    }

    public static Singleton getInstance() {
        if (instance != null) {
            synchronized (Singleton.class) {
                if (instance != null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
