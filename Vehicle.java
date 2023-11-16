public class Vehicle {
    public void drive(){
        System.out.println("The vehicle is moving");

    }
}

class Car2 extends Vehicle{
    @Override
    public void drive() {
        super.drive();
        System.out.println();
    }
}
