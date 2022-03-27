package test3;

import java.util.Scanner;

public class LeadersOfArray {
    public static void leadersOfArray(int[] arr) {

        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int j;
            for (j = i + 1; j < size; j++) {
                if (arr[i] <= arr[j])
                    break;
            }
            if (j == size) // the loop didn't break
                System.out.print(arr[i] + " ");
        }
    }

    

        public static void main (String[]args){

            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int input[] = new int[n];
            for(int i = 0; i < n; i++){
                input[i] = s.nextInt();
            }
            leadersOfArray(input);
        }
    }

