package DataStructures.RecursiveLinkedList;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedListUseR {

        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public static Node<Integer> takeInput() throws IOException {
        Node<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            Node<Integer> newNode = new Node<Integer>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            i += 1;
        }

        return head;
    }
        public static void print(Node<Integer> head){
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }


        public static Node<Integer> midPoint(Node<Integer> head) {
        //Your code goes here
        Node<Integer> slow = head , fast = head;
        while(fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

        public static Node<Integer> merge(Node<Integer> head1 ,Node<Integer> head2 ){
        Node<Integer> t1 = head2 , t2 = head2;
        Node<Integer> head = null , tail = null;

        if(head1==null){
            return head2;
        }if(head2==null){
            return head1;
        }
        if(t1.data <= t2.data){
            head=t1;
            tail=t1;
            t1=t1.next;

        }else {
            head=t2;
            tail=t2;
            t2=t2.next;
        }

        while(t1!= null && t2 != null){
            if(t1.data <= t2.data){
                tail.next = t1;
                tail = t1;
                t1=t1.next;
            }
            else{
                tail.next = t2;
                tail = t2;
                t2=t2.next;
            }
        }
        // one list is over
        if(t1 != null){
            //first list is remaining
            tail.next =t1;
        }else{
            tail.next = t2;
        }
        return head;
    }

        public static void printR(Node<Integer> head){
        if(head==null){
            return;
        }
        System.out.println(head.data + " ");
        printR(head.next);
    }

        public static Node<Integer> insertR(Node<Integer> head , int elem , int pos){

        if(head==null && pos>0){
            return head;
        }
        if(pos == 0){
            Node<Integer> newNode = new Node<>(elem);
            newNode.next = head;
            return newNode;
        }else {
            head.next = insertR(head.next, elem, pos-1);
            return head;
        }
    }

        public static void main(String[] args) throws IOException {

        Node<Integer> head1 = takeInput();
        Node<Integer> head2 = takeInput();
//        head = insertR(head, 20 , 2);
        Node<Integer> head = merge(head1,head2);
        print(head);
    }
    }

