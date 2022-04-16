package DataStructures.RecursiveLinkedList;

public class FindANodeInLL {
    public static int findNodeRec(LinkedListNode<Integer> head, int n) {
        //Your code goes here

        if(head==null)
            return -1;

        if(head.data.equals(n))
            return 0;

        int smallAns = findNodeRec(head.next,n);

        if(smallAns == -1)
            return -1;

        return smallAns+1 ;
    }
}

//         if(head==null)
//         return -1;

//     else
//     {
//         if(head.data!=n)
//         {
//             int k = findNodeRec(head.next, n);

//             if(k!=-1)
//                 return k+1;

//             else
//                 return -1;
//         }
//         else
//             return 0;
//     }
//     }
//}
