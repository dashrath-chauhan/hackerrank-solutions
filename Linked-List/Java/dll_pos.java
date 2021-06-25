class Result {

    /*
     * Complete the 'insertNodeAtPosition' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER data
     *  3. INTEGER position
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        SinglyLinkedListNode curr = llist;
        int count = 0;
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode new_node = SinglyLinkedListNode(data);
        
        if(data == 0){
            new_node.next = llist;
            llist = new_node;
            return llist;   
        }
        
        while(curr != null){
            count += 1;
            prev = curr;
            curr = curr.next;
            if(count == position)
                break;
        }        
        new_node.next = prev.next;
        prev.next = new_node;
        
        return llist;
    }

}