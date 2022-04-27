//You have been given two stacks that can store integers as the data. Out of the two given stacks, one is populated and the other one is empty.
// You are required to write a function that reverses the populated stack using the one which is empty.


package DataStructures.Stack;

import java.util.*;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> input, Stack<Integer> empty) {
        //Your code goes here
        if (input.size()==0 || input.size()==1)
        {
            return;
        }

        int top=input.pop();
        reverseStack(input,empty);

        while(!input.isEmpty())
        {
            empty.push(input.pop());
        }
        input.push(top);

        while(!empty.isEmpty())
        {
            input.push(empty.pop());
        }
    }
}
