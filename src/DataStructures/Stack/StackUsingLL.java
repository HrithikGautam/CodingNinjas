package DataStructures.Stack;

public class StackUsingLL<T> {

    private StackCollections.Node<T> head;
    private int size;
//    private Node<T> tail;

    public StackUsingLL(){
        head = null;
        size=0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void push(T elem){

        StackCollections.Node<T> newNode = new StackCollections.Node<T>(elem);
        newNode.next = head;
        head = newNode;
        size++;

    }

    public T top() throws StackEmptyException {
        if (head == null){
            //throw StackEmptyException
            throw new StackEmptyException();
        }
        return head.data;

    }

    public T pop() throws StackEmptyException {
        if (head == null){
            //throw StackEmptyException
            throw new StackEmptyException();
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }

}
