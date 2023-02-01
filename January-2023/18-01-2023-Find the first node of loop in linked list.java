//User function Template for J

class Solution {
    public static int findFirstNode(Node head){
        Node fast = head;
        Node slow = head;
        if(head == null || head.next == null) return -1;
        boolean isCycle = false;
        while(fast!=null && slow!=null){
            slow = slow.next;
            if(fast.next == null)return -1;
            fast = fast.next.next;
            if(fast==slow){
                isCycle = true;
                break;
            }
        }
        if(!isCycle) return -1;
        slow=head;
        while(fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast.data;
    }
}
