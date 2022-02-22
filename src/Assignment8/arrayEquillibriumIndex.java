package Assignment8;

public class arrayEquillibriumIndex {

    public static int arrayEquilibriumIndex(int[] arr){

        int totalSum =0 ,i=0;
        if (arr.length==0){
            return -1;
        }
        while(i<arr.length-1){
            totalSum += arr[i];
            i = i+1;
        }

        int leftSum =0, index = 0 ,rightSum =0;
        while(index<arr.length){
            rightSum = totalSum - leftSum - arr[index];

            if(rightSum==leftSum){
                return index ;
            }
            leftSum = leftSum+arr[index];
            index=index+1;
        }
        return -1;
    }
}
