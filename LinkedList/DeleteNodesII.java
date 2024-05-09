package LinkedList;

/*
2487. Remove Nodes From Linked List

You are given the head of a linked list.
Remove every node which has a node with a greater value anywhere to the right side of it.
Return the head of the modified linked list.

Example 1:
Input: head = [5,2,13,3,8]
Output: [13,8]
Explanation: The nodes that should be removed are 5, 2 and 3.
- Node 13 is to the right of node 5.
- Node 13 is to the right of node 2.
- Node 8 is to the right of node 3.
 
Example 2:
Input: head = [1,1,1,1]
Output: [1,1,1,1]
Explanation: Every node has value 1, so no nodes are removed.
*/

class DeleteNodesII {
    public static void main(String[] args) {
        ListNode head=new ListNode(9);
        populate(head,7);
        display(head);
        ListNode newHead=removeNodes(head);
        display(newHead);

    }
    public static ListNode removeNodes(ListNode head) {
        ListNode prev=null, curr=head;
        //Revers the LinkedList
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode dummyHead = new ListNode(-1);
        ListNode tempPrev = dummyHead;
        curr = prev;

        while (curr != null) {
            if (curr.val >= tempPrev.val) {
                tempPrev.next = curr;
                tempPrev = curr;
                curr = curr.next;
                tempPrev.next = null;
            } else {
                curr = curr.next;
            }
        }

        ListNode newPrev = null, newCurr = dummyHead.next;
        while (newCurr != null) {
            ListNode next = newCurr.next;
            newCurr.next = newPrev;
            newPrev = newCurr;
            newCurr = next;
        }

        return newPrev;

    }
     static void populate(ListNode node, int val) {
       ListNode current = node;
        for (int i = 1; i < val; i++) { // start from 1 since the first node is already provided
            current.next = new ListNode(i);
            current = current.next;
        }
    }
    public static void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println(); // Move to the next line after printing all elements
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}