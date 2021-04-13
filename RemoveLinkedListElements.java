/**
 * Given the head of a linked list and an integer val, remove all the nodes of
 * the linked list that has Node.val == val, and return the new head.
 * 
 * Example: Input: head = [1,2,6,3,4,5,6], val = 6 Output: [1,2,3,4,5]
 * 
 */

public class RemoveLinkedListElements {
    // Definition for singly-linked list.
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
        ListNode result = new ListNode();
        ListNode test = result;

        int[] val = new int[] { 1, 2, 6, 3, 4, 5, 6 };

        for (int i : val) {
            test.next = new ListNode(i);
            test = test.next;
        }
        result = removeElements(result, 6);
        result = result.next;
        while (result != null) {
            System.out.print(result.val);
            System.out.print(" ");
            result = result.next;
        }

    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode res = new ListNode();
        ListNode tmp = res;
        while (head != null) {
            if (head.val != val) {
                tmp.next = new ListNode(head.val);
                tmp = tmp.next;
            }
            head = head.next;
        }
        return res.next;
    }

}
