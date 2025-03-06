# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverse(self,head):
        prev = None
        while head:
            next_node = head.next
            head.next = prev
            prev = head
            head = next_node
        return prev
    def removeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        head = self.reverse(head)
        max_val = float('-inf')
        dummy = ListNode(0)
        new_head = dummy

        while head:
            if head.val >= max_val:
                max_val = head.val
                new_head.next = head
                new_head = head
            head = head.next
        new_head.next = None
        return self.reverse(dummy.next)