public class addTwoNumbers {

}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create a new ListNode to store data
        ListNode res = new ListNode();
        // Create a pointer of the res ListNode
        ListNode cur = res;
        // Checking if sum of two numbers greater than 10
        int addOne = 0;

        while (l1 != null || l2 != null) {

            if (l1 == null)
                l1 = new ListNode(0);
            if (l2 == null)
                l2 = new ListNode(0);

            int sum = l1.val + l2.val + addOne;
            addOne = sum / 10;

            // adding new Node to the List
            cur.next = new ListNode(sum % 10);
            cur = cur.next;

            // move to next Node
            l1 = l1.next;
            l2 = l2.next;

        }
        // Create one more Node if the number of last two number add up greater than 0
        if (addOne != 0)
            cur.next = new ListNode(addOne);

        return res.next;
    }

    /**
     * Definition for singly-linked list.
     * 
     */
    public class ListNode {
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
}