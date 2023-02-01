/* POTD : 7 Jan 2023
Title: Flattening a Linked List
Asked in : Amazon, 24*7 Innovation Lab
Category : DSA, Linked List
Link : https://practice.geeksforgeeks.org/problems/da62a798bca208c7a678c133569c3dc7f5b73500/1
Statement : Given a Linked List of size N, where every node represents a sub-linked-list and contains two pointers:
(i) a next pointer to the next node,
(ii) a bottom pointer to a linked list where this node is head.
Each of the sub-linked-list is in sorted order.
**/

class GfG
{
    Node flatten(Node root){
        // Your code here
	    if(root == null || root.next == null)
	    return root; 
	    root.next = flatten(root.next);
	    root = together(root,root.next);
	   
	    return root;
    }
    Node together(Node a, Node b){
        Node temp = new Node(0);
        Node newNode = temp;
        
        while(a!= null && b!= null){
            if(a.data<=b.data){
                temp.bottom = a;
                a=a.bottom;
                temp= temp.bottom;
            }else {
                temp.bottom = b;
                b = b.bottom;
                temp=temp.bottom;
            }
        }
        if(a!= null){
            temp.bottom = a;
        }else{
            temp.bottom = b;
        }
        return newNode.bottom;
    }
}
