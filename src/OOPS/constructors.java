package OOPS;

public class constructors {

    int x, y;

    void show() {
        System.out.println(x);
        System.out.println(y);

    }
    constructors(int x, int y) {
        this.x = x;
        this.y = y;

    }
        public static void main (String[]args){
            constructors c = new constructors(1, 2);
            c.show();
            constructors c1 = new constructors(c);
            c1.show();
        }
        constructors(constructors a) {
            this.x = a.x;
            this.y = a.y;
        }
    }
