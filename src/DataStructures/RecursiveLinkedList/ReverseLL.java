package DataStructures.RecursiveLinkedList;

public class ReverseLL {
    public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
        //Your code goes here
        if(head == null || head.next == null){
            return head;
        }
        LinkedListNode<Integer> smallHead = reverseLinkedListRec(head.next);
        LinkedListNode<Integer> reversedTail = head.next;
        reversedTail.next = head;
        head.next = null;
        return smallHead;

    }
}
