package java_concurrency_in_praciice.demo;

/**
 * @author yanlianglong
 * @Title: ThreadDemo.java
 * @Package PACKAGE_NAME
 * @Description:
 * @date 2019/6/14 13:18
 */
public class ThreadDemo extends Thread {
    @Override
    public void run() {
        System.out.println("继承Thread类");
    }
}
