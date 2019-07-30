/**
 * @author yanlianglong
 * @Title: JumpFloorII.java
 * @Package PACKAGE_NAME
 * @Description:
 * @date 2019/5/31 14:37
 */
/*
题目描述
一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class JumpFloorII {
    public int JumpFloorII(int target) {
        if(target == 1) return 1;
        if(target == 2) return 2;
        return 2*JumpFloorII(target-1);
    }
}
