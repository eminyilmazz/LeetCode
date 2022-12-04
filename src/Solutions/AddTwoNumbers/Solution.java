package Solutions.AddTwoNumbers;

//TODO: UNSOLVED
public class Solution {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int first = 0, second = 0;
        ListNode temp = new ListNode(-99999);
        ListNode curr = temp;
        for (int i = 1; l1.next != null; i++) {
            first += l1.val * i;
            l1 = l1.next;
        }
        for (int i = 1; l2.next != null; i++) {
            second += l2.val * i;
            l2 = l2.next;
        }
        int sum = first + second;
        while(sum > 0) {
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            sum = sum / 10;
        }
        return temp.next;
    }
}
