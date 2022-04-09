package DataStructures.LinkedLists;

public class ReverselinkedList <T> {

    T data;
    ReverselinkedList<T> next;

    public ReverselinkedList(T data) {
        this.data = data;
    }

    class ReverseLL {

        public static void printReverse(ReverselinkedList<Integer> root) {
            //Your code goes here
            if (root == null) {
                return;
            }
            printReverse(root.next);
            System.out.print(root.data + " ");//PRINTING WHILE FALLING DOWN THE STACK

        }
    }
}