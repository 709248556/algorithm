package java_concurrency_in_praciice.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author yanlianglong
 * @Title: ExecutorServiceDemo.java
 * @Package PACKAGE_NAME
 * @Description:
 * @date 2019/6/14 14:09
 */
public class ExecutorServiceDemo {

    public static void main(String[] args) {
//        newCachedThreadPool();
//        newFixedThreadPool();
//        newScheduledThreadPool();
        singleThreadExecutor();
    }
    /*
    用execute 将重用以前构造的线程（如果线程可用）。
    如果现有线程没有可用的，则创建一个新线程并添加到池中。
    终止并从缓存中移除那些已有60 秒钟未被使用的线程
    */
    public static void newCachedThreadPool() {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                Thread.sleep(index * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(index);
                }
            });
        }
    }
    //创建一个可重用固定线程数的线程池，以共享的无界队列方式来运行这些线程
    public static void newFixedThreadPool() {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            final int index = i;
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(index);
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public static void newScheduledThreadPool() {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
//        scheduledThreadPool.schedule(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("delay 3 seconds");
//            }
//        }, 3, TimeUnit.SECONDS);
        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("delay 1 seconds, and excute every 3 seconds");
            }
        }, 1, 3, TimeUnit.SECONDS);
    }
    //这个线程池可以在线程死后（或发生异常时）重新启动一个线程来替代原来的线程继续执行下去
    public static void singleThreadExecutor() {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            singleThreadExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(index);
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}