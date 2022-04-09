package DataStructures.LinkedLists;

public class palindromeLL <T> {

    T data;
    palindromeLL<T> next;

    public palindromeLL(T data) {
        this.data = data;
    }

    class palindromeLinkedList {

        public static boolean isPalindrome(palindromeLL<Integer> head) {
            //Your code goes here
            if (head == null || head.next == null) {
                return true;
            }

            palindromeLL<Integer> fast = head;
            palindromeLL<Integer> slow = head;

            while (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }

            palindromeLL<Integer> secondHead = slow.next;
            slow.next = null;
            secondHead = reverseLL(secondHead);

            palindromeLL<Integer> firstSubList = secondHead;
            palindromeLL<Integer> secondSubList = head;

            while (firstSubList != null) {
                if (firstSubList.data != secondSubList.data) {
                    return false;
                }
                firstSubList = firstSubList.next;
                secondSubList = secondSubList.next;
            }
            firstSubList = head;
            secondSubList = reverseLL(secondHead);
            while (firstSubList.next != null) {
                firstSubList = firstSubList.next;
            }
            firstSubList.next = secondSubList;
            return true;
        }

        private static palindromeLL<Integer> reverseLL(palindromeLL<Integer> head) {

            palindromeLL<Integer> curr = head;
            palindromeLL<Integer> prev = null;
            palindromeLL<Integer> fwd = null;

            while (curr != null) {
                fwd = curr.next;
                curr.next = prev;
                prev = curr;
                curr = fwd;
            }
            return prev;
        }
    }
}