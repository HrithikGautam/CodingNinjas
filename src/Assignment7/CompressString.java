package Assignment7;

public class CompressString {

    public static String getCompressedString(String str) {

       /* int counter;
        String result="";
        int i=0;
        while (i<str.length()){
            counter=1;
            for (int j=i+1;j<str.length();j++){
                if (str.charAt(i) == str.charAt(j)){
                    counter++;
                }
            }
            if(counter>1){
                result = result+str.charAt(i)+counter ;
            }
            else
                result = result+str.charAt(i) ;

            str = str.replaceAll(String.valueOf(str.charAt(i)), "");
        }

        return result;

*/

        String result = "";

        int index = 0;

        while (index < str.length()) {
            char c = str.charAt(index);
            int count = count(str, index);
            if (count == 1)
                result += "" + c;
            else
                result += "" + c + count;
            index += count;
        }

        return result;
    }

    public static int count(String text, int index) {
        char c = text.charAt(index);
        int i = 1;
        while (index + i < text.length() && text.charAt(index + i) == c)
            i++;
        return i;
    }

}

