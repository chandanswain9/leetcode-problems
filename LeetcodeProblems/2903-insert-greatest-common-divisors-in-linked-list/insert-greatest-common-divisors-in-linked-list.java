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
import java.util.*;
class Solution {
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode current = head;
        
        while (current != null && current.next != null) {
            int gcdVal = gcd(current.val, current.next.val);

            ListNode newNode = new ListNode(gcdVal);

            newNode.next = current.next;
            current.next = newNode;
            current = current.next.next;
        }
        
        return head;
    }
}