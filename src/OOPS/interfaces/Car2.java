package OOPs.interfaces;

public class Car2 extends Vehicle1 implements VehicleInterface , carInterface{

    @Override
    public int numGears() {
        return 0;
    }

    @Override
    public String getCompany() {
        return null;
    }

    @Override
    public boolean isMotorized() {
        return true;
    }

    void print(){
        System.out.println(PI);
    }
}
