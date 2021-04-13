public class ReverseLinkedList {
    public static void main(){

    }
    public static ListNode reverseList(ListNode head) {
        ListNode res = new ListNode();
           if(head == null){
              return null;
           }else{
              res.val = head.val;
              head = head.next;
          }
  
        while(head != null){
            ListNode tmp = new ListNode(head.val);
            tmp.next = res;
            res = tmp;
            head = head.next;
        }
          return res;
      }

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
}
