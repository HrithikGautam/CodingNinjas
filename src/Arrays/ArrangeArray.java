package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrangeArray {

    public static int[] arrange(int[] arr, int n) {
        int k =0;
        if (n%2==1)
        { for (int i=1 ;k<((n+1)/2);i = i+2)
        {
            arr[k] = i;
            k++;
        }
            for(int i= n-1;k<n;i=i-2)
            {
                arr[k] = i;
                k++;
            }
        }
        else  if (n%2==0)
        {
            for (int i=1 ;k<n/2;i = i+2)
            {
                arr[k] = i;
                k++;
            }
            for(int i= n;k<n;i=i-2)
            {
                arr[k] = i;
                k++;
            }
        }
        return arr;
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            arrange(arr, n);
            printArray(arr);

            t -= 1;
        }
    }
}
