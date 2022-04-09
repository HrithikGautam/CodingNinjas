package DataStructures.LinkedLists;

public class EliminateDuplicates <T> {

    T data;
    EliminateDuplicates<T> next;

    public EliminateDuplicates(T data) {
        this.data = data;
    }

    class eliminateDuplicate {
        public static EliminateDuplicates<Integer> removeDuplicates(EliminateDuplicates<Integer> head) {
            //Your code goes here
            if (head == null || head.next == null)
                return head;

            EliminateDuplicates<Integer> prev = head;
            EliminateDuplicates<Integer> p = head.next;

            while (p != null) {
                if (p.data.compareTo(prev.data) == 0)//compare non primitive dataType like this not using == (VERY IMPORTANT THING TO NOTE)
                {
                    prev.next = p.next;
                    p = p.next;
                } else {
                    prev = p;
                    p = p.next;
                }
            }
            return head;
        }
    }
}
