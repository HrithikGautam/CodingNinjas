package OOPS;

public class fraction1 {

    private int numerator;
    private int denominator;

    public fraction1(int numerator , int denominator){
        if(denominator == 0){
            //throw error
            //return;    ideally it should throw error , but we are just passing deno as 1
            denominator =1;
        }
        this.numerator= numerator;
        this.denominator = denominator;
        simplify();
    }

    public void setNumerator(int num){
        this.numerator = num;
        simplify();
    }

    public int getNumerator(){
        return numerator;
    }

    public void setDenominator(int num){
        if(denominator == 0){
            //throw error
            return;
        }
        this.denominator = num;
        simplify();
    }

    public int getDenominator(){
        return denominator;
    }

    public void add(fraction1 f2){
        // first fraction is which on the function is called
        // second fraction is passed as arguements
        this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

    public static fraction1 add2(fraction1 f1 , fraction1 f2){
        int newNum = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
        int newDeno = f1.denominator * f2.denominator;
        fraction1 f3 = new fraction1(newNum ,newDeno) ;
        return f3;
    }

    private void simplify(){
        int gcd = 1;
        int smaller = Math.min(numerator,denominator);
        for(int i = 2 ; i<= smaller ; i++){
            if(numerator % i == 0 && denominator % i  == 0){
                gcd = i;
            }
        }
        numerator =numerator/gcd;
        denominator= denominator/gcd;
    }

    public void print(){
        System.out.println(numerator + "/" + denominator);
    }

    public void increment(){
        numerator =numerator + denominator ;
        simplify();
    }

}

