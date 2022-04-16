package DataStructures.RecursiveLinkedList;

public class MidPointOfLL {

    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        //Your code goes here

        if (head == null)
            return head;
        LinkedListNode<Integer> fastptr = head.next;
        LinkedListNode<Integer> slowptr = head;

        // Move fastptr by two and slow ptr by one
        // Finally slowptr will point to middle node
        while (fastptr != null) {
            fastptr = fastptr.next;
            if (fastptr != null) {
                slowptr = slowptr.next;
                fastptr = fastptr.next;
            }
        }
        return slowptr;
    }
}
