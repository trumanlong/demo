package tech.truman.demo.ioc;

import org.springframework.stereotype.Component;

@Component
public class Singleton {
    private Singleton() {
        System.out.println("单例对象被实例化");
    }

    static class SingletonInstance {
        private static final Singleton instance = new Singleton();

        public SingletonInstance() {
            System.out.println("内部类被实例化");
        }
    }

    public static final Singleton getInstance() {
        return SingletonInstance.instance;
    }
}
