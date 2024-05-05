package LinkedList;


import java.util.List;

class DeleteNode {
    public static void main(String[] args) {
        ListNode head=new ListNode(6);
        populate(head,5);
        display(head);
        ListNode delete=getNodeByValue(head,3);
        deleteNode(delete);
        display(head);


    }
    public static void populate(ListNode node, int val) {
        ListNode current = node;
        for (int i = 1; i < val; i++) { // start from 1 since the first node is already provided
            current.next = new ListNode(i);
            current = current.next;
        }
    }
    public static void deleteNode(ListNode nodeToDelete) {
        if (nodeToDelete != null && nodeToDelete.next != null) {
            // Copy the data from the next node to the current node
            nodeToDelete.val = nodeToDelete.next.val;
            // Delete the next node by skipping it
            nodeToDelete.next = nodeToDelete.next.next;
        }
    }
    public  static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public static void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println(); // Move to the next line after printing all elements
    }
    public  static ListNode getNodeByValue(ListNode head, int targetValue) {
        ListNode current = head;
        while (current != null) {
            if (current.val == targetValue) {
                return current; // Return the reference to the node with the target value
            }
            current = current.next;
        }
        return null; // Return null if the target value is not found in the linked list
    }

}
