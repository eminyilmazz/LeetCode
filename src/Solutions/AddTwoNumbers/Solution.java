package Solutions.AddTwoNumbers;

//TODO: UNSOLVED, THIS SOLUTION DOESN'T WORK BECAUSE THE TESTS HAS VALUES OVER THE MAXIMUM INTEGER LIMIT
public class Solution {
    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int first = 0, second = 0;
        ListNode temp = new ListNode(-99999);
        ListNode curr = temp;
        for (int i = 1; l1 != null;) {
            first += l1.val * i;
            l1 = l1.next;
            i = i * 10;
        }
        for (int i = 1; l2 != null;) {
            second += l2.val * i;
            l2 = l2.next;
            i = i * 10;
        }
        int sum = first + second;
        if (sum == 0) return new ListNode(0, null);
        while(sum > 0) {
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            sum = sum / 10;
        }
        return temp.next;
    }
}
