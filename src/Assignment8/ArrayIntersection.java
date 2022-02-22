package Assignment8;

import java.util.Arrays;

public class ArrayIntersection {
    public static void intersection(int[] arr1, int[] arr2) {

        int i = 0, j = 0;
        int n = arr1.length;
        int m = arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while (i < n && j < m) {

            if(arr1[i]==arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }else{
                j++;
            }
        }
    }

}
