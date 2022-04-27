package DataStructures.Stack;

public class Node<T> {

        T data;
        DataStructures.LinkedLists.Node<T> next;

        Node(T data){
            this.data=data;
//        next=null;            // not required because default value of any node will be null
    }
}
