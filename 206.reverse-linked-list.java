/*@lc app=leetcode id=206 lang=java
 *
 *[206]Reverse Linked List
 *
 *https://leetcode.com/problems/reverse-linked-list/description/
 *
 *algorithms
 *Easy(55.48%)
 *Total Accepted:620.1K
 *Total Submissions:1.1M
 *Testcase Example:'[1,2,3,4,5]'
 *
 *Reverse a singly linked list.
 *
 *Example:
 *
 *
 *Input:1->2->3->4->5->NULL
 *Output:5->4->3->2->1->NULL
 *
 *
 *Follow up:
 *
 *A linked list can be reversed either iteratively or recursively.Could you
 *implement both?
 *
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
