package mianshi;

/**
 * Created by zhangdong on 2017/9/30.
 */

import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 */
public class Solution2 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode temp = listNode;
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }
        while (!stack.empty()){
            list.add(stack.pop());
        }
        return list;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
