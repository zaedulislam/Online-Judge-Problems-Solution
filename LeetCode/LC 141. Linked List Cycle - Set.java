/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> hasSeen = new HashSet<>();
        ListNode current = head;

        while(current != null){
            if(!hasSeen.add(current)){
                return true; 
            }

            current = current.next;
        }

        return false;
    }
}
