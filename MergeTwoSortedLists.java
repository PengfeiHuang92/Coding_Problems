/**
 * Merge two sorted linked lists and return it as a sorted list. The list should
 * be made by splicing together the nodes of the first two lists. Example: 1 ->
 * 4 -> 6 | 2 -> 5 -> 7 result: 1 -> 2 -> 4 -> 5-> 6 -> 7 *
 */
public class MergeTwoSortedLists {
    public void main(String[] args) {
        
    }
    public ListNode add(ListNode l, int k){
        ListNode tmpNode = new ListNode(k);
        while(l != null){
            l = l.next;
        }
        l = tmpNode;
        return l;
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode cur = res;
        int addOne = 0;
        while(l1 != null || l2 != null){
            if(l1 == null) l1= new ListNode(0);
            if(l2 == null) l2= new ListNode(0);
            int sum = l1.val + l2.val + addOne;
            addOne = sum / 10;
            cur.next = new ListNode(sum%10);
            cur = cur.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(addOne != 0 ) {cur.next = new ListNode(1);}
        return res.next;
        
    }

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
