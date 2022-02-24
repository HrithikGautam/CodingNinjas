package Recursion2;

public class RemoveX {

    public static String removeX(String s){

        if(s.length()==0){
            return "";
        }

        if(s.charAt(0)=='x')
        {
            return removeX(s.substring(1));
        }
        return s.charAt(0) + removeX(s.substring(1));

    }
}
