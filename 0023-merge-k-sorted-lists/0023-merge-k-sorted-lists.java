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
class Solution {
    class Node{
        ListNode node;
        Node(ListNode n){
            this.node=n;
        }
    }
  
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Node>pq=new PriorityQueue<>((a,b)->{
            return a.node.val-b.node.val;
        });

        for(ListNode head:lists){
            if(head!=null){
                pq.add(new Node(head));
            }
        }
        ListNode dummy= new ListNode(-1);
        ListNode tail=dummy;

        while(!pq.isEmpty()){
            Node curr = pq.poll();
            tail.next=curr.node;
            tail=tail.next;

            if(curr.node.next!=null){
                pq.add(new Node(curr.node.next));
            }
        }return dummy.next;
    }
}