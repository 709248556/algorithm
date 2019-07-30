/**
 * @author yanlianglong
 * @Title: FindArray.java
 * @Package PACKAGE_NAME
 * @Description:二维数组中的查找
 * @date 2019/5/29 13:30
 */

/*
题目描述
在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
判断数组中是否含有该整数。
 */
public class FindArray {
    public boolean Find(int target, int [][] array) {
        int row=array.length-1;//统计行数
        int column=array[0].length-1;//统计列数
        int n=0;//记录列数
        //一定要把array[row][n]!=target放在最后判断，否则会溢出！
        while(row>=0&&n<=column&&array[row][n]!=target) {
            if(array[row][n]>target) row--;
            else if(array[row][n]<target) n++;
        }
        if(row>=0&&n<=column&&array[row][n]==target) return true;
        else return false;
    }
}
