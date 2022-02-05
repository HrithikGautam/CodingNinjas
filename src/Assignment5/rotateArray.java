package Assignment5;

public class rotateArray {

    public static void rotate(int[] a, int d) {

        int[] temp = new int[d];
        int n =a.length;

        for (int i = 0; i < d; i++)
            temp[i] = a[i];

        for (int i = d; i < n; i++)
        {
            a[i - d] = a[i];
        }
        for (int i = 0; i < d; i++)
            a[n - d + i] = temp[i];
    }
    public static void printArray(int[]a){
        int n=a.length;
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
