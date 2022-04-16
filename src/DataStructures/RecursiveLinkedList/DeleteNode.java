package DataStructures.RecursiveLinkedList;

public class DeleteNode {
    public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {

        // If linked list is empty
        if (head == null)
            return null;

        // Base case (start needs to be deleted)
        if (pos == 0)
        {
            return head.next;

        }

        head.next = deleteNodeRec(head.next, pos-1);
        return head;
    }
}
