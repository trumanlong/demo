package tech.truman.demo.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;

@Component
@EnableConfigurationProperties
public class Car {

    private String name;
    private String length;
    private String width;
    private String height;
    private Wheel wheel = new Wheel();

    // 省略其他不重要代码
    public static void main(String[] arg) throws ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException, InstantiationException {
//        Class hungerClass = Class.forName("tech.truman.demo.ioc.HungerSingleton");
//        Object hungerSingleton = hungerClass.getConstructor().newInstance();
//        Class singletonClass = Class.forName("tech.truman.demo.ioc.Singleton");
        Class singleton3 = Class.forName("tech.truman.demo.ioc.Singleton3");
//        HungerSingleton hungerSingleton = (HungerSingleton) hungerClass.getDeclaredConstructor().newInstance();
//        Singleton singleton = (Singleton) singletonClass.getDeclaredConstructor().newInstance();
//        Wheel wheel = new NewWheel();
//        SingleTon1 singleTon1 = new SingleTon1();
//        wheel.foo();
        Singleton3 singleton31 = Singleton3.getInstance();
    }
}
