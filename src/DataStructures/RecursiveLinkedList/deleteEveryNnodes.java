package DataStructures.RecursiveLinkedList;
//You have been given a singly linked list of integers along with two integers, 'M,' and 'N.'
// Traverse the linked list such that you retain the 'M' nodes, then delete the next 'N' nodes. Continue the same until the end of the linked list.
//To put it in other words, in the given linked list, you need to delete N nodes after every M nodes.

public class deleteEveryNnodes {
    public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
        //Your code goes here
        if(head==null)
            return head;
        if(M==0)
            return null;
        if(N==0)
            return head;
        LinkedListNode<Integer> curr=head,t;
        int count;
        while(curr!=null)
        {
            for(count=1;count<M && curr!=null;count++)
            {
                curr=curr.next;
            }
            if(curr==null)
                return head;
            t=curr.next;
            for(count=1;count<=N && t!=null;count++)
            {
                t=t.next;
            }
            curr.next=t;
            curr=t;}
        return head;
    }
}
