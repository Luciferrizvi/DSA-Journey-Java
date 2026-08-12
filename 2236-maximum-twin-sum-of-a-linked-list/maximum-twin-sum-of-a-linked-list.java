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
    public static ListNode reverse(ListNode head){ //reverse whole linked list after left middle node.
        ListNode curr = head;
        ListNode prev = null;
        ListNode agla = null;
        while(curr != null){
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = reverse(slow.next);
        slow.next = temp;

        ListNode p1 = head;
        int sum = p1.val + temp.val;
        while(temp != null){
            if(sum <= p1.val+temp.val){
                sum = p1.val+temp.val;
            }
            p1 = p1.next;
            temp = temp.next;
        }
        return sum;
    }
}