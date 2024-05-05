package LinkedList;


class BinaryToDecimal {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(0);
        head.next.next=new ListNode(1);
        System.out.println(getDecimalValue(head));
    }
    public static int getDecimalValue(ListNode head) {
        int result = 0;
        while(head != null)
        {
            result = result<<1;
            result += head.val;
            head = head.next;
        }
        return result;

    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}