package xiecheng;

///**
// * 单例模式之懒汉模式(线程安全：方法同步）
// */
//public class Singleton {
//    private Singleton() {}
//    private static Singleton singleton = null;
//    public static synchronized Singleton getInstance() {
//        if(singleton == null) {
//            singleton = new Singleton();
//        }
//        return singleton;
//    }
//}

///**
// * 单例模式之懒汉模式(线程安全: 双重检查锁定）
// */
//public class Singleton {
//    private Singleton() {
//    }
//
//    private static Singleton singleton = null;
//
//    public static Singleton getInstance() {
//        if (singleton == null) {
//            synchronized (Singleton.class) {
//                if (singleton == null) {
//                    singleton = new Singleton();
//                }
//            }
//        }
//        return singleton;
//    }
//}

///**
// * 单例模式之懒汉模式(线程安全：静态内部类，推荐，既保证了线程安全，又避免了同步带来的性能问题）
// */
//public class Singleton {
//    private Singleton() {
//    }
//
//    private static class LazyLoader {
//        private static Singleton SINGLETON = new Singleton();
//    }
//
//    public static final Singleton getInstance() {
//        return LazyLoader.SINGLETON;
//    }
//
//}

/**
 * 单例模式之饿汉模式
 */
public class Singleton {
    private Singleton() {
    }

    private static final Singleton singleton = new Singleton();

    public static final Singleton getInstance() {
        return singleton;
    }

}


