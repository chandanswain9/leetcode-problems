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
    public int pairSum(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode temp = head;
        while(temp != null) {
            values.add(temp.val);
            temp = temp.next;
        }
        int maxSum = 0;
        int n = values.size();
        for (int i = 0; i < n / 2; i++) {
            int twinSum = values.get(i) + values.get(n - 1 - i);
            maxSum = Math.max(maxSum, twinSum);
        }

        return maxSum;
    }
}