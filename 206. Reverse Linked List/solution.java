/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode();
        ListNode previous  = dummy;
        ListNode current = head;
        ListNode pointer3 = null;
        while(current != null) {
            pointer3 = current.next;
            current.next = previous;
            previous = current;
            current = pointer3;
        }
          
        head.next = null;
        return previous;
    }
}