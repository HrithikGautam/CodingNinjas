package DataStructures.LinkedLists;

public class appendLastN<T> {

    T data;
    appendLastN<T> next;

    public appendLastN(T data) {
        this.data = data;
    }

    class appendToLastN {
        public static appendLastN<Integer> appendLastNToFirst(appendLastN<Integer> head, int n) {
            //Your code goes here
            appendLastN<Integer>temp1=head;
            appendLastN<Integer>temp2=head;
            int length=LengthIterative(head);
            int i=0;
            if (head == null || n == 0)	{
                return head;
            }
            while(i<length-n-1)
            {
                temp1=temp1.next;
                i++;
            }
            head=temp1.next;
            temp1.next=null;
            appendLastN<Integer>tempHead=head;
            while(tempHead.next!=null)
            {
                tempHead=tempHead.next;
            }
            tempHead.next=temp2;
            return head;
        }
        public static int LengthIterative(appendLastN<Integer>head){
            int count=0;
            while(head!=null)
            {
                count++;
                head=head.next;
            }
            return count;
        }
    }

}
