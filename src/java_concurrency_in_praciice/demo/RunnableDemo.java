package java_concurrency_in_praciice.demo;

/**
 * @author yanlianglong
 * @Title: Runnable.java
 * @Package PACKAGE_NAME
 * @Description:
 * @date 2019/6/14 13:15
 */
public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("实现Runnable接口");
    }
}
