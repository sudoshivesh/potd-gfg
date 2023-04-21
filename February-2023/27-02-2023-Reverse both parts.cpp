//User function Template for C++

/*
Definition for singly Link List Node
struct Node
{
    int data;
    struct Node *next;

    Node(int x)
    {
        data = x;
        next = NULL;
    }
};
*/


class Solution
{
public:
   
    Node *reverse(Node *head, int k)
    {
        // code here
        Node* curr = head, *prev = NULL;
        int temp = k;
        
        // reversing first k elements
        while(temp--)
        {
            Node* ptr = curr->next;
            curr->next = prev;
            prev = curr;
            curr = ptr;
        }
        
        // new head of final linked list will be the head1
        Node* head1 = prev;
        
        prev = NULL;
        
        // reversing last n-k elements
        while(curr)
        {
            Node* ptr = curr->next;
            curr->next = prev;
            prev = curr;
            curr = ptr;
        }
        // conecting the tail (last element) of first linked list to the head(first element) of second linked list
        head->next = prev;
        return head1;
        // code here
    }
};
