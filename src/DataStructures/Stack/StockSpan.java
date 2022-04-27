//Afzal has been working with an organization called 'Money Traders' for the past few years.
// The organization is into the money trading business. His manager assigned him a task. For a given array/list of stock's prices for N days,
// find the stock's span for each day.
//The span of the stock's price today is defined as the maximum number of consecutive days(starting from today and going backwards)
// for which the price of the stock was less than today's price.
//For example, if the price of a stock over a period of 7 days are [100, 80, 60, 70, 60, 75, 85], then the stock spans will be [1, 1, 1, 2, 1, 4, 6].

package DataStructures.Stack;

import java.util.Stack;
public class StockSpan {

        public static int[] stockSpan(int[] price) {
            //Your code goes here

            Stack<Integer> stk = new  Stack<>();
            int n = price.length;

            int[] output = new int[n];

            stk.push(0);
            output[0] = 1;

            for (int i = 1; i < n; i++){
                while (!stk.isEmpty() && price[stk.peek()] < price[i]){
                    stk.pop();
                }

                if (stk.isEmpty()){
                    output[i] = i + 1;
                }else {
                    output[i] = i - stk.peek();
                }
                stk.push(i);
            }

            return output;
        }

}
