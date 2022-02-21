package Assignment7;

public class duplicateString {
    public static String removeConsecutiveDuplicates(String str) {
		/*StringBuffer s = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
           		  s=str.charAt[i];
            if (str.charAt(i) == str.charAt(i+1)) {
                i++;
            } else
                s=str.charAt(i);
        }
        return s;*/
        String result = "";
        char ch = str.charAt(0);
        result += ch;
        for(int i = 1;i < str.length();i++) {
            if(str.charAt(i) == ch);
            else
                result += str.charAt(i);
            ch = str.charAt(i);
        }
        return result;
    }

}
