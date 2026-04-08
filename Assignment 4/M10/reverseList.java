//Given the head of a singly linked list, reverse the list, and return the reversed list.
import java.util.*;
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;

        while(temp != null){
            ListNode fr = temp.next;
            temp.next = prev;
            prev = temp;
            temp = fr;
        }

        return prev;
    }
}