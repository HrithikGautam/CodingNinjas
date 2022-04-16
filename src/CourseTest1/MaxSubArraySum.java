package CourseTest1;

import java.util.Scanner;

public class MaxSubArraySum {
   public static int maximumSubarraySum(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i <= n - 1; i++) {
            currSum += arr[i];

            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
//        printArray(a);
        System.out.println(maximumSubarraySum(a));
    }
}

