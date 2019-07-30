/**
 * @author yanlianglong
 * @Title: ReverseList.java
 * @Package PACKAGE_NAME
 * @Description:
 * @date 2019/6/12 15:43
 */
/*
题目描述
输入一个链表，反转链表后，输出新链表的表头。
 */
public class ReverseList {
    //链表
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    //递归实现
    public ListNode ReverseList(ListNode head) {
        if(head==null||head.next ==null) return head;
        ListNode prev = ReverseList(head.next);
        head.next.next = head;
        head.next = null;
        return prev;
    }
}
