package DataStructures.Recursion3;

import java.util.Scanner;

public class returnKeypad {

    public static String getOptions(int digit){
        if(digit ==  2){
            return "abc";
        }
        if(digit ==  3){
            return "def";
        }
        if(digit ==  4){
            return "ghi";
        }
        if(digit ==  5){
            return "jkl";
        }
        if(digit ==  6){
            return "mno";
        }
        if(digit ==  7){
            return "pqrs";
        }
        if(digit ==  8){
            return "tuv";
        }
        if(digit ==  9){
            return "wxyz";
        }

        return "";

    }

    public static String[] keypadCombinations(int input) {
        if (input == 0) {
            String[] output = new String[1];
            output[0] = "";
            return output;
        }

        String[] smallOutput = keypadCombinations(input/10);
        int lastDigit = input % 10;
        String lastDigitOptions = getOptions(lastDigit);
        String[] output = new String[smallOutput.length * lastDigitOptions.length()];

        int k= 0;
        for(int i = 0 ; i<smallOutput.length ; i++){
            for (int j = 0; j < lastDigitOptions.length(); j++) {
                output[k] = smallOutput[i] + lastDigitOptions.charAt(j);
                k++;
            }
        }
        return output ;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number");
        int input = s.nextInt();
        String[] output = keypadCombinations(input);
        for(String outputString : output){
            System.out.println(outputString);
        }
    }
}

