class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode temp = head;
        int count = 1;
        while (temp.next != null) {
            temp = temp.next;
            count++;
        }
        
        temp.next = head;
        k = k % count;  
        int upto = count - k;
        temp = head;
        for (int i = 1; i < upto; i++) {
            temp = temp.next;
        }
        ListNode newHead = temp.next;
        temp.next = null; 
        return newHead;
    }
}