//For a given a string expression containing only round brackets or parentheses,
// check if they are balanced or not. Brackets are said to be balanced if the bracket which opens last, closes first.
//You need to return a boolean value indicating whether the expression is balanced or not.

package DataStructures.Stack;

import java.util.*;

public class BracketsBalanced {

        public static boolean isBalanced(String expression) {
            //Your code goes here
            Stack<Character> stack = new Stack<Character>();
            for (int j=0;j<expression.length();j++)
            {
                char i=expression.charAt(j);
                if (i=='[' || i=='{' || i=='(')
                {
                    stack.push(i);
                }
                else if(i==']' || i=='}' || i==')')
                {
                    if (stack.isEmpty())
                        return false;

                    else
                    {
                        if (i==']')
                        {
                            if (stack.peek()!='[')
                                return false;
                            else
                                stack.pop();
                        }

                        else if (i=='}')
                        {
                            if (stack.peek()!='{')
                                return false;
                            else
                                stack.pop();
                        }

                        else if (i==')')
                        {
                            if (stack.peek()!='(')
                                return false;
                            else
                                stack.pop();
                        }
                    }
                }

            }
            return stack.isEmpty();
        }
    }
