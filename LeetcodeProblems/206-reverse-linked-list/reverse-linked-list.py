# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        temp = head

        while temp:
            next_node = temp.next
            temp.next = prev
            prev = temp
            temp = next_node
        
        return prev