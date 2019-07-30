/**
 * @author yanlianglong
 * @Title: Fibonacci.java
 * @Package PACKAGE_NAME
 * @Description:
 * @date 2019/5/31 14:17
 */
/*
题目描述 前缀 后缀suffix
大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 */
public class Fibonacci {
    public int Fibonacci(int n) {
        int prefix = 1;
        int suffix = 1;
        int index = 1;
        if (n == 1 || n == 2) return 1;
        for (int i = 3; i <= n; i++) {
            suffix = index;
            index = prefix + suffix;
            prefix = suffix;
        }
        return index;
    }
}
