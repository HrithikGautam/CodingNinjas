package OOPS.Exceptions;

public class ExceptionDemo {

    public static int fact(int n) throws NegativeNumberException{
        if(n<0) {
            throw new NegativeNumberException();
        }
        int ans =1 ;
        for(int i =2 ; i <= n;i++){
            ans = ans * i;
        }
        return ans;
    }

        public static int divide( int a, int b) throws DivideByZeroException{  // either handle or pass the exception
            if (b == 0) {
//                throw new ArithmeticException();
                throw new DivideByZeroException();
            }
            return a / b;
        }


        public static void main (String[]args)  {
//        String s = null;
//        System.out.println(s.length());
//        System.out.println(4/0);
//        System.out.println("Main");
            try{
                divide(10, 0);
                System.out.println(fact(2));
            }catch (DivideByZeroException e){
                System.out.println(" divide by zero exception raised");
                e.printStackTrace();
            }catch (NegativeNumberException e){
                System.out.println(" Catch for negative Number exception");
            }catch (Exception e){                                       // Generic exception , no need for other catch blocks
                System.out.println(" Generic exception");
            } finally {
                System.out.println("finally block");
            }
            System.out.println("Main");

        }

}
