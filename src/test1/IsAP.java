package test1;
import java.util.Arrays;
import java.util.Scanner;

public class IsAP {

        // Returns true if a permutation of
        // arr[0..n-1] can form arithmetic
        // progression
        static boolean checkIsAP(int arr[], int n) {
            if (n == 1)
                return true;

            // Sort array
            Arrays.sort(arr);

            // After sorting, difference between
            // consecutive elements must be same.
            int d = arr[1] - arr[0];
            for (int i = 2; i < n; i++)
                if (arr[i] - arr[i - 1] != d){
                    return false;
                }
return true;
        }

        //driver code
        public static void main (String[] args)
        {
            Scanner s= new Scanner(System.in);
            int n = s.nextInt();
            int[] arr = new int[n];
            arr[n]= s.nextInt();
            n = arr.length;

            if(checkIsAP(arr ,n))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }

