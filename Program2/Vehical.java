package Program2;
class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}
class Car extends Vehicle {
    
    void drive() {
        System.out.println("Repairing a car");
    }
}
public class Vehical {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.drive();  
        Car myCar = new Car();
        myCar.drive();      
    }
}
