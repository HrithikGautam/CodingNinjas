package Operators;

public class pp {
    public static void main(String[] args) {

        int n=5;
        System.out.println('*');
        for(int i=1;i<=n;i++){
            System.out.print('*');
            for(int j=1;j<=n;j++){
                if(i+1==j){
                    break;
                   // return;
                }
                System.out.print(j+" ");
            }
            System.out.println('*');
        }
    }
}
