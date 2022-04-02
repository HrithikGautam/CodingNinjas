package OOPs.generics;

public class motor implements printInterface{

    int maxSpeed ;
    String company;

    public motor(int maxSpeed , String company){
        super();
        this.maxSpeed=maxSpeed;
        this.company=company;
    }

    public void print(){
        System.out.println(maxSpeed + " " + company);
    }
}
