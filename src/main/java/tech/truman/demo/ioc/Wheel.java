package tech.truman.demo.ioc;

import java.util.HashMap;
import java.util.Map;

public class Wheel {
    private String brand;
    private String specification;

    public Wheel() {
        System.out.println("Wheel");
    }

    public void foo() {
        System.out.println("轮子");
        Map<String, Object> f = new HashMap<>();
    }
    // 省略其他不重要代码
}
