package Assignment5;

public class CheckArrayRotation {

    public static int arrayRotateCheck(int[] arr){

        int n =arr.length;
        if(n==0){
            return  0;
        }
        int min = arr[0], min_index = -1;

        for (int i = 0; i < n; i++)
        {

            if (min > arr[i])
            {
                min = arr[i];
                return i;
                // min_index = i;
            }
        }
        return 0;
    }
}
