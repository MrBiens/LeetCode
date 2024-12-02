package Easy;

import Medium.LinkedList.ListNode;

public class _206_ReverseLinkedList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode next= null;
            ListNode curr=head;
            while(curr != null){
                next = curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            return prev;

        }

}
