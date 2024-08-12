# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        dummy_head=ListNode()
        carry, current=0, dummy_head

        while list1 or list2 or carry:
            sum_=(list1.val if list1 else 0)+(list2.val if list2 else 0)+carry
            carry,val=divmod(sum_,10)
            current.next=ListNode(val)
            current=current.next

            list1=list1.next if list1 else None
            list2=list2.next  if list2 else None
        
        return dummy_head.next