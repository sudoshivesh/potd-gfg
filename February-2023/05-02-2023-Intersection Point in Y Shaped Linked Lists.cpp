/* Linked List Node
struct Node {
  int data;
  struct Node *next;
  Node(int x) {
    data = x;
    next = NULL;
  }
}; */
class Solution
{
public:
    int intersectPoint(Node* head1, Node* head2)
    {
        // Your Code Here
        Node* first = head1, *sec = head2;
    bool changed1 = false, changed2 = false;
    while(true) {
        if(first == sec)
            return first->data;        
        if(first->next)
            first = first->next;
        else if(!changed1) {
            changed1 = true;
            first = head2;
        }
        else
            return -1;         
        if(sec->next)
            sec = sec->next;
        else if(!changed2) {
            changed2 = true;
            sec = head1;
        }
        else
            return -1;
    }  
    return -1;
    }
};
