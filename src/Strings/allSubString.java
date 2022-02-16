package Strings;

public class allSubString {

    public static void printSubstrings(String str){
     /* Method-1
      for(int start=0;start<str.length();start++){
          //We will be printing all substrings starting with char at index start
          for(int end=start;end<str.length();end++){
              System.out.println(str.substring(start,end+1));
          }
      }*/
        // Method-2
        for(int len=1;len<=str.length();len++){
            //We have to print all strings wih length as "len"
            for(int start=0;start<=str.length()-len;start++){
                int end=start+len-1;
                System.out.println(str.substring(start,end+1));
            }
        }
    }

    public static void main(String args[]) {
        String str="pqrs";
        printSubstrings(str);
    }
}
