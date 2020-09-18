package tech.truman.demo.ioc;

public class Singleton3 {
    private Singleton3() {
        System.out.println("Singleton3");
    }

    static class SingletonHolder {
        private static final Singleton3 instance = new Singleton3();
    }

    public static final Singleton3 getInstance() {
        return SingletonHolder.instance;
    }
}
