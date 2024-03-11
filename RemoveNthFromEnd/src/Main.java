// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static void main(String[] args) {

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {


        ListNode curr, prev;
        curr = head.next;
        prev = head;
        if (head.val == n)
            head = head.next;
        while (curr != null) {

            if (curr.val == n) {
                prev.next = curr.next;
                curr = curr.next;
            } else {
                prev = prev.next;
                curr = curr.next;
            }
        }
        return head;
    }
}