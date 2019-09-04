import java.beans.beancontext.BeanContext;

/**
 * @author yanlianglong
 * @Title: minNumberInRotateArray.java
 * @Package PACKAGE_NAME
 * @Description:
 * @date 2019/5/30 15:02
 */

/*
题目描述：
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
NOTE：给出的所有元素都大于0，若数组大小为0，请返=回0。
 */
/*
二分查找
 */
public class minNumberInRotateArray {
    private int MinOrder(int[] array,int begin,int end){
        for(;begin<end && array[begin]>=array[begin];begin++);
        return array[begin];
    }
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0) return 0;
        int left = 0;
        int right = array.length-1;
        int middle = -1;
        while (array[left] >= array[right]){
            if(right-left ==1){
                middle = right;
                break;
            }
            middle = left+(right-left)/2;
            if(array[right] == array[left]&& array[middle]==array[right]){
                return MinOrder(array,left,right);
            }
            if(array[middle] < array[right]) right = middle;
            if(array[middle] < array[left]) left = middle;
        }
        return array[middle];
    }
}
