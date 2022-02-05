package Assignment4;

public class FindDuplicate {

    public static int duplicateNumber(int arr[]) {
        int dup = arr[0];
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    dup=arr[j];
            }
        }
        return dup;
    }
}
