//For a given expression in the form of a string, find if there exist any redundant brackets or not.
// It is given that the expression contains only rounded brackets or parenthesis and the input expression will always be balanced.
//A pair of the bracket is said to be redundant when a sub-expression is surrounded by unnecessary or needless brackets.

package DataStructures.Stack;

import java.util.*;
public class checkRedundantBrackets {

        public static boolean checkRedundantBrackets(String expression) {
            //Your code goes here
            Stack<Character> stack=new Stack<Character>();
            int count=0;
            for(int i=0;i<expression.length();i++)
            {
                char c=expression.charAt(i);
                //System.out.print(c);

                if (c==')')
                {
                    //System.out.println();
                    while(!stack.isEmpty() && stack.peek()!='(')
                    {
                        count=count+1;
                        stack.pop();
                        //System.out.print(stack.pop());
                    }
                    //System.out.println();
                    //System.out.println(count);
                    if (count==0 || count==1)
                    {
                        return true;
                    }
                    stack.pop();
                    count=0;

                }
                else
                {
                    stack.push(c);
                }
            }
            return false;
        }
    }