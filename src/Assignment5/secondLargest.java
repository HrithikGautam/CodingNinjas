package Assignment5;

public class secondLargest {

    public static int secondLargestElement(int[] arr) {
        int max = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2 && arr[i] != max)
                max2 = arr[i];
        }
        return max2;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}
   /* public static void main(String[] args) {

            int[] input = takeInput();
            Solution.pushZerosAtEnd(input);
            printArray(input);
        }
*/
