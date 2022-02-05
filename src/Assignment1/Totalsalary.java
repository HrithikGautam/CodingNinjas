package Assignment1;

import java.util.Scanner;

public class Totalsalary {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        float basic = s.nextInt();
        char grade = s.next().charAt(0);

        float hra = (basic*50)/100 ;
        float da = (basic*20)/100 ;
        int allow1 = 1700;
        int allow2 = 1500;
        int allow3 = 1300;
        float pf = (basic*11)/100;
        int allow ;
        if ((grade == 'a')||(grade == 'A')){
            allow = allow1;
        }
        else if((grade == 'b')||(grade == 'B')){
            allow = allow2;
        }else {
            allow = allow3;
        }

        float totalSal = basic + hra + da + allow - pf ;
        int result = (int)(totalSal*100)%100;
        System.out.println(result);

    }
}
