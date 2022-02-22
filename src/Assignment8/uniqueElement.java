package Assignment8;

public class uniqueElement {

    public static int findUnique(int[] arr) {

        int x=0;
        for(int i =0 ; i< arr.length ; i++){
            x = x^arr[i];
        }
        return x;
    }
}
