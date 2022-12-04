package Solutions.LinkedListCycleII;

import java.util.HashSet;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode tmp = head;
        HashSet<ListNode> set = new HashSet<>();

        if (tmp == null) {return null;}

        while (tmp.next != null) {
            if(!set.add(tmp)) {
                return tmp;
            }
            tmp = tmp.next;
        }
        return null;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
