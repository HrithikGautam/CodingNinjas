package Assignment4;

public class FindUnique {

    public static int findUnique(int[] arr){

        int result = 0;
        //even occurence will nullify
        for(int i=0;i<arr.length;i++){
            result ^= arr[i];
        }
        return result;
    }
}
