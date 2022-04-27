package DataStructures.Stack;

import java.util.Stack;

public class StackCollections {

    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<>();

//        StackUsingArray stack = new StackUsingArray();
        int arr[] = {5 , 6 ,7 ,1 ,9};

        for(int elem : arr){
            stack.push(elem);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        stack.push(10);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }

    public static class Node<T> {

        T data;
        Node<T> next;
        Node(T data){
            this.data=data;
        }
    }
}
