package OOPS.Inheritance;

public class Car extends Vehicle {
    int numDoors;
//    int maxSpeed;

    public Car(int numDoors , int maxspeed){
        super(maxspeed);
        System.out.println("Car's Constructor");
        this.numDoors=numDoors;
    }

    public void printCar(){
        super.print();
        System.out.println("car" + "coolor" + getColor() + "maxSpeed" + maxSpeed + "numDoors" + numDoors);
    }

    public void printMaxSpeed(){
        super.maxSpeed = 150;
        System.out.println(maxSpeed + " " + super.maxSpeed);
    }
}



