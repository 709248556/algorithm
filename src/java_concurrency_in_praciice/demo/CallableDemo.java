package java_concurrency_in_praciice.demo;

import java.util.concurrent.Callable;

/**
 * @author yanlianglong
 * @Title: CallableDemo.java
 * @Package PACKAGE_NAME
 * @Description:
 * @date 2019/6/14 14:56
 */
public class CallableDemo implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("子线程在进行计算");
        Thread.sleep(3000);
        int sum = 0;
        for(int i=0;i<100;i++)
            sum += i;
        return sum;
    }
}
