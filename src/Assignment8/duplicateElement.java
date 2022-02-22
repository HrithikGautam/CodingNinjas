package Assignment8;

public class duplicateElement {

    public static int findDuplicate(int[] arr) {

        int n = arr.length;
        int sum1= ((n-2)*(n-1))/2;
        int sum2 =0;

        for(int i =0; i<n; i++){
            sum2 = sum2+ arr[i];
        }

        int x = sum2 - sum1;
        return x;
    }
}
