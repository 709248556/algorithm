/**
 * @author yanlianglong
 * @Title: FindKthToTail.java
 * @Package PACKAGE_NAME
 * @Description:
 * @date 2019/6/12 12:02
 */
/*
题目描述
输入一个链表，输出该链表中倒数第k个结点。
 */

public class FindKthToTail {
    //链表
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null)   return head;
        if (k == 0)   return null;
        int i = 1;
        ListNode k_listNode = head;
        while (head.next != null){
            head = head.next;
            if(i >= k) k_listNode = k_listNode.next;
            i++;
        }
        if(i < k) return null;
        return k_listNode;
    }
}
