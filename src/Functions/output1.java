package Functions;

public class output1 {

    public static void func1(int a, int b) {
        int ans = 1;
        for (int i = 0; i < b; i++) {
            ans *= a;
        }
        System.out.print(ans);
    }
//     public static void main (String[] args) {
//         func1(2,5);
//     }

    public static int sum(int a, int b) {
        System.out.print("int sum ");
        return a + b;
    }

    public static long sum(long a, long b) {
        System.out.print("long sum ");
        return a + b;
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        //System.out.println(sum(a, b));
        //System.out.println(func1(a,b));
    }
}
