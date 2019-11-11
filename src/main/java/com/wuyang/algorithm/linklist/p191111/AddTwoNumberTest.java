package com.wuyang.algorithm.linklist.p191111;

import com.wuyang.algorithm.linklist.ListNode;

/**
 * 描述：两个链表表示的数字相加
 *
 * @author wuyang
 * @date 2019/11/11
 **/
public class AddTwoNumberTest {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        int carry = 0;
        ListNode dummyHead = new ListNode(-1);
        ListNode preHead = dummyHead;
        while (l1 != null || l2 != null || carry > 0) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }

            preHead.next = new ListNode(carry % 10);
            preHead = preHead.next;
            carry /= 10;
        }
        return dummyHead.next;
    }

}
