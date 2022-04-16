package DataStructures.RecursiveLinkedList;

//Given a singly linked list of integers, reverse the nodes of the linked list 'k' at a time and return its modified list.
// 'k' is a positive integer and is less than or equal to the length of the linked list.
// If the number of nodes is not a multiple of 'k,' then left-out nodes, in the end, should be reversed as well.

public class kreverse {
    public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
        if(head==null)
            return head;
        if(head.next==null)
            return head;
        if(k==0)
            return head;
        LinkedListNode<Integer> h1=head,h2,t1=head;
        int count=1;
        while(count<k && t1.next!=null)
        {
            t1=t1.next;
            count++;
        }

        h2=t1.next;
        t1.next=null;


        DoubleNode ans=reversePart(h1);
        LinkedListNode<Integer> secondHead=kReverse(h2,k);
        ans.tail.next=secondHead;
        return ans.head;

    }
    private static DoubleNode reversePart(LinkedListNode<Integer> head)
    {
        if(head==null || head.next==null)
        { DoubleNode ans=new DoubleNode();
            ans.head=head;
            ans.tail=head;
            return ans;}

        DoubleNode ans=reversePart(head.next);
        ans.tail.next=head;
        head.next=null;
        ans.tail=ans.tail.next;
        return ans;
    }

}

class DoubleNode{
    LinkedListNode<Integer> head;
    LinkedListNode<Integer> tail;
}
