/**
 * @author yanlianglong
 * @Title: Power.java
 * @Package PACKAGE_NAME
 * @Description:
 * @date 2019/6/4 12:40
 */

/*
题目描述
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Power {
    public double Power(double base, int exponent) {
        int n;
        double target = base;
        if(exponent == 0) return 1;
        else if(exponent <0) n = -exponent;
        else n = exponent;
        for(int i = 2;i<=n;i++){
            target = target*base;
        }
        return exponent >0 ? target:(1/target);
    }
}
