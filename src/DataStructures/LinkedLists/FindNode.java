package DataStructures.LinkedLists;

public class FindNode <T> {

    T data;
    FindNode<T> next;

    public FindNode(T data) {
        this.data = data;
    }

    class findNode {

        public static int findNode(FindNode<Integer> head, int n) {
            // Write your code here.
            FindNode<Integer> temp = head;
            int count = 0;
            while (temp != null) {
                if (temp.data == n)
                    return count;
                else {
                    count++;
                    temp = temp.next;
                }
            }
            return -1;
        }
    }
}
