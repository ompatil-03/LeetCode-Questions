package LinkedList;
/*
234. Palindrome Linked List
Solved
Easy
Topics
Companies
Given the head of a singly linked list, return true if it is a
palindrome
 or false otherwise.
Example 1:
Input: head = [1,2,2,1]
Output: true
Example 2:
Input: head = [1,2]
Output: false
Constraints:
The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9
 */

public class PalindromeList {
    public boolean isPalindrome(ListNode head) {
        ListNode reversed = reverseAndClone(head);
        return isSame(head, reversed);
    }

    private ListNode reverseAndClone(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode newNode = new ListNode(head.val);
            newNode.next = prev;
            prev = newNode;
            head = head.next;
        }
        return prev;
    }

    private boolean isSame(ListNode head1, ListNode head2) {
        while (head1 != null && head2 != null) {
            if (head1.val != head2.val) {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1 == null && head2 == null;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val,ListNode next) { this.val = val; this.next = next; }
    }
}
