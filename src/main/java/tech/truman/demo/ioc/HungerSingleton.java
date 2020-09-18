package tech.truman.demo.ioc;

import org.springframework.stereotype.Component;

@Component
public class HungerSingleton {
    private static HungerSingleton instance = new HungerSingleton();

    private HungerSingleton() {
        System.out.println("饿汉对象被初始化");
    }

    public static HungerSingleton getInstance() {
        return instance;
    }
}
