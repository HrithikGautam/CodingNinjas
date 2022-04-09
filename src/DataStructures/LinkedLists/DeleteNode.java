package DataStructures.LinkedLists;

public class DeleteNode<T> {

    T data;
    DeleteNode<T> next;

    public DeleteNode(T data) {
        this.data = data;
    }

    class Delete {

        public static DeleteNode<Integer> deleteNode(DeleteNode<Integer> head, int pos) {

            if (head == null) {
                return head;
            }
            if (pos == 0) {
                return head.next;
            }
            int count = 0;
            DeleteNode<Integer> curr = head;
            while (curr != null && count < (pos - 1)) {
                curr = curr.next;
                count++;
            }
            if (curr == null || curr.next == null) {
                return head;
            }
            curr.next = curr.next.next;
            return head;
        }
    }
}
