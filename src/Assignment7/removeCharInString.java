package Assignment7;

public class removeCharInString {

    public static String removeAllOccurrencesOfChar(String str , char ch) {
    int n= str.length();
    String ans="";

    for (int i =0; i< n; i++){
        if(str.charAt(i) != ch){
            ans+=str.charAt(i);
        }
    }
        return ans;
    }
}




   /* StringBuilder strBuilder = new StringBuilder();
    char[] rmString = str.toCharArray();
        for(int i=0; i<rmString.length; i++){
        if(rmString[i] == ch){

        } else {
            strBuilder.append(rmString[i]);
        }
    }
        return strBuilder.toString();
}
*/