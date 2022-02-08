package Assignment5;

public class secondLargest {

    public static int secondLargestElement(int[] arr) {
        int max=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max2=max;
                max=arr[i];
            }
            else if (arr[i] > max2 && arr[i] != max)
                max2 = arr[i];
        }
        return max2;
    }
}

   /* public static int secondLargestElement(int[] a) {

        int temp = Integer.MIN_VALUE;
        int n = a.length;

        if (n == 0) {
            return Integer.MIN_VALUE;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {

                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                } else if (areSame(a)) {
                    return temp;
                }
            }
        }
        return a[n - 2];
    }

    public static boolean areSame(int a[]) {
        int first = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] != first)
                return false;
        return true;
    }
}*/