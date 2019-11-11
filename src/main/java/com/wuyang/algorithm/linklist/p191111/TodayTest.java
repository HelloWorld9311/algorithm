package com.wuyang.algorithm.linklist.p191111;

import com.wuyang.algorithm.array.p191104.RemoveDuplicatesTest;
import com.wuyang.algorithm.array.p191104.RemoveElementTest;
import com.wuyang.algorithm.linklist.ListNode;

/**
 * 描述：当天测试类
 *
 * @author wuyang
 * @date 2019/11/11
 **/
public class TodayTest {

    public static void main(String[] args) {
        // 测试链表反转的两种方法
//        ListNode head = ListNode.getTestListNode();
//        System.out.println("反转之前为：" + head);
//        System.out.println("反转之后为：" + ReverseLinkList.reverseIterator(head));

//        ListNode head2 = ListNode.getTestListNode();
//        System.out.println("反转之前为：" + head2);
//        System.out.println("反转之后为：" + ReverseLinkList.reverseRecursive(head2));

//        ListNode l1 = ListNode.getTestListNode();
//        ListNode l2 = ListNode.getTestListNode();
//        System.out.println(AddTwoNumberTest.addTwoNumbers(l1, l2));

        ListNode head = ListNode.getTestListNode();
//        System.out.println(RemoveElementsTest.removeElementRecursive(head, 2));
        System.out.println(RemoveElementsTest.removeElementIterator(head, 2));

    }

}
