package Solutions.ReverseLinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        while (current != null)  {
            next = current.next; //next
            current.next = prev; //reverse the link;
            prev = current;      //shift to right
            current = next;      //shift to right
        }
        return prev;
    }
}