package DataStructures.LinkedLists;

public class InsertNode<T> {

    T data;
    InsertNode<T> next;

    public InsertNode(T data) {
        this.data = data;
    }

    class Insert {

        public static InsertNode<Integer> insert(InsertNode<Integer> head, int pos, int data) {
            InsertNode<Integer> nodeToBeInserted = new InsertNode<Integer>(data);

            if (pos == 0) {
                nodeToBeInserted.next = head;
                return nodeToBeInserted;
            } else {
                int count = 0;
                InsertNode<Integer> prev = head;
                while (count < pos - 1 && prev != null) {
                    count++;
                    prev = prev.next;
                }
                if (prev != null) {
                    nodeToBeInserted.next = prev.next;
                    prev.next = nodeToBeInserted;
                }
            }
            return head;
        }
    }
}

