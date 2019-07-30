package java_concurrency_in_praciice;

/**
 * @author yanlianglong
 * @Title: NoVisibility.java
 * @Package java_concurrency_in_praciice
 * @Description:
 * @date 2019/6/18 20:03
 */
public class NoVisibility {
    private static boolean ready;
    private static int number;
    private static class ReaderThread extends Thread{
        public void run(){
//            while (!true){
//                Thread.yield();
//                System.out.println(number);
//            }
        }
    }

    public static void main(String[] args) {
        new ReaderThread().start();
        number = 42;
        ready = Boolean.TRUE;
    }
}
