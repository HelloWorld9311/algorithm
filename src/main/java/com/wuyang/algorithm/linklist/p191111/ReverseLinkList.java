package com.wuyang.algorithm.linklist.p191111;

import com.wuyang.algorithm.linklist.ListNode;

/**
 * 描述：反转链表
 *
 * @author wuyang
 * @date 2019/11/11
 **/
public class ReverseLinkList {

    public static ListNode reverseIterator(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null, next = null;
        ListNode curr = head;
        while (curr != null) {
            next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static ListNode reverseRecursive(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

}
