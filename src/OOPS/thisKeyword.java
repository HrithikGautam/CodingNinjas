package OOPS;

import java.util.Scanner;

/*public class thisKeyword {

    int i ;
    Scanner s = new Scanner(System.in);

    void setValue(int i)
    {
        this.i=s.nextInt();
    }
    void show()
    {
        System.out.println(i + 10);
    }
}

class Xyz
{
    public static void main(String[] args) {

        thisKeyword t = new thisKeyword();
        t.setValue(10);
        t.show();
    }
}*/
class Test
{
    int a;
    int b;

    public void set(int a, int b)
    {
        b = a;
        this.b = b;
    }

    void display()
    {
        System.out.println("a=" + a + " b=" + b);
    }
}
class T{
    public static void main(String[] args)
    {
        Test object = new Test();
        object.set(10,20);
        object.display();
    }
}