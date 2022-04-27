package DataStructures.Stack;

public class StackUsingArray {

    private int[] data;
    private int topIndex; // index of topmost element of the stack

    public StackUsingArray(){
        data = new int[10];
        topIndex= -1;
    }

    public int size(){
        return topIndex + 1 ;
    }

    public boolean isEmpty(){
        return topIndex == -1 ;
    }

    private void doubleCapacity(){
        System.out.println("Double Capacity");
        int temp[] = data;
        data = new int[2 * temp.length];
        for (int i  = 1 ; i < temp.length ; i++){
            data[i] = temp[i];
        }

    }

    //O(1)
    public void push(int elem) throws StackFullException {
       //if stack is full
        if(topIndex == data.length - 1){
//            StackFullException e = new StackFullException();
//            throw e;
            throw new StackFullException();
        }
        data[++topIndex] = elem;
    }

    //O(1)
    public int top() throws StackEmptyException {
        if (topIndex == -1){
            //throw StackEmptyException
            throw new StackEmptyException();
        }
        return data[topIndex];
    }

    public int pop() throws StackEmptyException {
        if (topIndex == -1){
            //throw StackEmptyException
            throw new StackEmptyException();
        }
        int temp = data[topIndex];
        topIndex--;
        return temp;
    }


}

