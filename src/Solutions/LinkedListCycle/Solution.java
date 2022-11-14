package Solutions.LinkedListCycle;

import java.util.HashSet;

/*
 * Less efficient solution.
*/


public class Solution {

    public boolean hasCycle(ListNode head) {
        ListNode tmp = head;
        Boolean result = false;
        HashSet<ListNode> set = new HashSet<>();

        if (tmp == null) {return false;}

        while (tmp.next != null) {
            if(!set.add(tmp)) {
                result = true;
                break;
            }
            tmp = tmp.next;
        }
        return result;
    }
}
