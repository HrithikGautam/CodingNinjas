package Arrays;

public class linearSearch {

    public static int linearSearch(int arr[], int x) {

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                x=i;
                return x;
            }
        }
        return -1;
    }
}
