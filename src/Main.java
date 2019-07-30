import java_concurrency_in_praciice.demo.RunnableDemo;
import java_concurrency_in_praciice.demo.ThreadDemo;

public class Main{

    public static void main(String[] args) {
        RunnableDemo runnable = new RunnableDemo();
        Thread thread = new Thread(runnable);
        thread.run();

        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.run();
    }
}
