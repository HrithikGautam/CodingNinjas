package DataStructures.LinkedLists;



public class linkedListUse {

    public static Node<Integer> createLinkedList(){

        Node<Integer> n1;
        n1= new Node<>(10);          //n1-@100

        Node<Integer> n2 = new Node<>(20);          //n2-@150
        Node<Integer> n3 = new Node<>(30);          //n3-@200
        Node<Integer> n4 = new Node<>(40);          //n4-@250

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;

        System.out.println("n1 " + n1 + " data " + n1.data + " next " + n1.next);
        System.out.println("n2 " + n2 + " data " + n2.data + " next " + n2.next);
        System.out.println("n3 " + n3 + " data " + n3.data + " next " + n3.next);
        System.out.println("n4 " + n4 + " data " + n4.data + " next " + n4.next);

        return n1;
    }

    public static void print(Node<Integer> head) {

        Node<Integer> temp = head;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp= temp.next;
        }
        System.out.println();
        // calling twice , but it won't print the list twice because at the end of the previous loop , head became null.
        while(head != null){
            System.out.println(head.data + " ");
            head= head.next;
        }

        //        System.out.println("Print" + head);
       /* System.out.println(head.data);
        System.out.println(head.next);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);*/
    }

    public static void increment(Node<Integer> head){

//        head.data++;            // this will increment head data because this head and main head are pointing to same
//        head = new Node<>(100);   // this will create a new head to work in

        Node<Integer> temp = head;
        while(temp != null){
            temp.data++;
            temp= temp.next;
        }
    }

    public static int lengthLL(Node<Integer> head){
        Node<Integer> temp = head;
        int count=0;
        while(temp != null){
            count++;
            temp= temp.next;
        }
        return count;
    }

    public static void NthNode(Node<Integer> head, int i){
        Node<Integer> temp = head;
        int count=0;
        while(temp != null) {
            if (count == i)
                count++;
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

//        Node<Integer> n1 =new Node<>(10);
//        System.out.println(n1);                 // stores reference of next node
//        System.out.println(n1.data);            //
//        System.out.println(n1.next);
        Node<Integer> head = createLinkedList();
        increment(head);
        print(head);
//        print(head);
    }


}
