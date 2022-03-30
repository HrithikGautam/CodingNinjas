package OOPS;

public class fractionUse {

    public static void main(String[] args) {
        fraction1 f1 = new fraction1(4, 6);
        f1.print();
//        f1.setNumerator(12);
//        f1.setDenominator();
        f1.increment();
        f1.print();

        fraction1 f2 = new fraction1(4, 8);
        f1.add(f2);
        f1.print();

        fraction1 f3 = fraction1.add2(f1, f2);
        f3.print();

    }
}
