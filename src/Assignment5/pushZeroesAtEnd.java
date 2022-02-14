package Assignment5;

public class pushZeroesAtEnd {

    public static void pushZerosAtEnd(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];
        while (count < n)
            arr[count++] = 0;
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
    
   /* public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }*/
/*

public static void main(Strings args[]) {
    
    int[] input = takeInput();
            pushZerosAtEnd(input);
            printArray(input);  
    }
}
*/
