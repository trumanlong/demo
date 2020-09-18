package tech.truman.demo.ioc;

public class SingleTon1 {
    private static SingleTon1 singleTon1;


    private void foo() {

    }

    public SingleTon1 getInstance() {
        if (singleTon1 == null) {
            singleTon1 = new SingleTon1();
            return singleTon1;
        } else {
            return singleTon1;
        }
    }
}
