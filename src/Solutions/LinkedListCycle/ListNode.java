package Solutions.LinkedListCycle;

public class ListNode {
    int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
        next = null;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
