package com.wuyang.algorithm.linklist.p191111;

import com.wuyang.algorithm.linklist.ListNode;

/**
 * 描述：删除链表中指定元素
 *
 * @author wuyang
 * @date 2019/11/11
 **/
public class RemoveElementsTest {

    public static ListNode removeElementRecursive(ListNode head, int val) {
        if (head == null || head.next == null) {
            return head;
        }
        head.next = removeElementRecursive(head.next, val);
        if (head.val == val) {
            return head.next;
        }
        return head;
    }

    public static ListNode removeElementIterator(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return head;
        }

        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }
        return head;
    }

}
