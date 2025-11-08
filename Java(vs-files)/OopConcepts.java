import java.util.Random;
import java.util.Scanner;

//Abstraction
abstract class Car {
    public abstract void stop();
}

class Honda extends Car{
    public void stop() {
        System.out.println("The car stopped");
        System.out.println("The engine rests");
    }
}

//Encapsulation
class Name {
    private String name;

    //Getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }
}

//Inheritance
class Motor {
    public int cubicCm;
    public String wheelStatus;

    public Motor(int cubicCm, String wheelStatus) {
        this.cubicCm =cubicCm;
        this.wheelStatus = wheelStatus;
    }

    public void applyBreak() {
        wheelStatus = "Stop";
        System.out.println("The motor stopped");
    }

    public void applyGas() {
        wheelStatus = "Go";
        System.out.println("The motor is moving");
    }

    public String printStatus() {
        return ("The motor has " + cubicCm + "CC and its status is " + wheelStatus);
    }
    
    //Polymorphism: CompileTime (Method Overloading)
    public void speed() {
        System.out.println("Speeding up");
    }

    public String speed(int accelerate) {
        System.out.println("The vehicle is speeding up at " + accelerate + " miles per hour");
        return ("It is speeding up indefinitely");
    }

    public int speed(int accelerate, int seconds) {
        int hour = seconds/3600;
        System.out.println("The vehicle is speeding up at " + accelerate + " miles per hour and decelerate after " + hour  + " hours");
        return hour;
    }
}

class Nmax extends Motor {
    public String gasStatus;

    public Nmax(int cubicCm, String wheelStatus, String gasStatus) {
        super(cubicCm, wheelStatus);
        this.gasStatus = gasStatus;
    }

    public void setGasStatuts(String gasStatus) {
        this.gasStatus = gasStatus;
    }

    public String printStatus() {
        return (super.printStatus() + " Motor Gas Status is " + gasStatus);
    }
}

//Polymorphism
class Rider {
    public void typeOfRider() {
        System.out.println("Casual Rider");
    }
}

//Polymorphism: RunTime (Method Overriding)
class transportRider extends Rider {
    public void typeOfRider() {
        System.out.println("Transport Rider");
    }
}

class deliveryRider extends Rider {
    public void typeOfRider() {
        System.out.println("Delivery Rider");
    }
}

class OopConcepts {

    public static void main(String[] args) {
        Car car = new Honda();
        car.stop();

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String inputName = input.nextLine();

        Name carName = new Name();
        carName.setName(inputName);

        System.out.println("Your name is: " + carName.getName());

        Motor action = new Motor(0, "stop");
        action.applyBreak();
        action.applyGas();

        Nmax motor = new Nmax(400, "Stop", "Full");
        System.out.println(motor.printStatus());

        motor.speed();
        motor.speed(400);
        motor.speed(400, 3600);

        Rider rider = getRider();
        rider.typeOfRider();

        input.close();
    }

    private static Rider getRider() {
        Random random = new Random();
        int number = random.nextInt(5);
        return (number %2 == 0 ? new transportRider() : new deliveryRider());
    }
}