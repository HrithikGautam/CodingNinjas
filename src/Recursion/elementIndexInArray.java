package Recursion;

public class elementIndexInArray {

    public static int firstIndex(int a[],int x){
        if(a.length==0){
            return -1;
        }
        if(a[0]==x){
            return 0;
        }
        int smallArray[]=new int[a.length-1];
        for(int i=1;i<a.length;i++){
            smallArray[i-1]=a[i];
        }
        int fi=firstIndex(smallArray,x);
        if(fi==-1){
            return -1;
        }else{
            return fi+1;
        }


    }
    public static int firstIndexBetter(int a[],int x,int si){
        if(si==a.length){
            return -1;
        }
        if(a[si]==x){
            return si;
        }
        int k=firstIndexBetter(a,x,si+1);
        return k;
    }
}
