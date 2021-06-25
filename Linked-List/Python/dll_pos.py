#
# Complete the 'insertNodeAtPosition' function below.
#
# The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
# The function accepts following parameters:
#  1. INTEGER_SINGLY_LINKED_LIST llist
#  2. INTEGER data
#  3. INTEGER position
#

#
# For your reference:
#
# SinglyLinkedListNode:
#     int data
#     SinglyLinkedListNode next
#
#

def insertNodeAtPosition(llist, data, position):
    # Write your code here

    curr = llist
    count = 0
    prev = None
    new_node = SinglyLinkedListNode(data)
    
    if data == 0:
        new_node.next = llist
        llist = new_node
        return llist
    
    while curr:
        count += 1
        prev = curr
        curr = curr.next
        if count == position:
            break
    
    new_node.next = prev.next
    prev.next = new_node
    
    return llist