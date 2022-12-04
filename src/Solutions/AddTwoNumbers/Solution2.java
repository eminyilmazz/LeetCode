package Solutions.AddTwoNumbers;

/**a bit of cheating happened here*/

public class Solution2 {
    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(Solution.ListNode l1, Solution.ListNode l2) {
        ListNode temp = new ListNode();
        ListNode curr = temp;
        int carry = 0;
        int sum = 0;

        while (l1 != null || l2 != null || carry == 1) {
            sum = 0;
            if (l1 != null) {
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum = sum + l2.val;
                l2 = l2.next;
            }
            sum = sum + carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            curr.next = node;
            curr = curr.next;
        }
        return temp.next;
    }
}
