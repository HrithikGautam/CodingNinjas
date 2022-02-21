package Assignment7;

public class stringPermutation {
    public static boolean isPermutation(String str1, String str2) {
        int[] arr = new int[256];
        if(str1.length()!=str2.length()){
            return false;
        }


        for(int i=0; i<str1.length(); i++){
            int n=(int)(str1.charAt(i));
            arr[n]++;
        }

        for(int i=0; i<str2.length(); i++){
            int n=(int)(str2.charAt(i));
            arr[n]--;
        }

        for(int i =0 ; i<256; i++){
            if(arr[i]!=0)
                return false;
        }
        return true;
    }
}
