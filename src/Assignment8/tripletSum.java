package Assignment8;
import java.util.*;

public class tripletSum {

    public static int tripletSum(int[] input, int x){
        Arrays.sort(input);
        int count=0;

        for(int i=0; i<input.length; i++)
        {
            int k = x - input[i];
            int st = i + 1;
            count += pairSum(input, k, st);
        }

        return count;
    }



    public static int pairSum(int[] arr, int num, int i){
        //Arrays.sort(arr);
        int j=arr.length-1,c=0;
        while(i<j){
            if(arr[i]+arr[j]>num){
                j--;
            }
            else if(arr[i]+arr[j]<num){
                i++;
            }
            else{
                c++;
                int temp=j-1;
                while(i<temp){
                    if(arr[i]+arr[temp]==num){
                        c++;
                    }
                    temp--;
                }
                temp=i+1;
                while(temp<j){
                    if(arr[j]+arr[temp]==num){
                        c++;
                    }
                    temp++;
                }

                i++;
                j--;
            }
        }
        return c;
    }

}
