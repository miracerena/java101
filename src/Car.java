package src;

public class Car {
    // Nitelikler
    String type = "Sedan";
    String model;
    String color;
    int speed;
    int speedLimit = 250;

    Car(String model, int speed, int speedLimit, String color) {
        this.model = model;
        this.speed = speed;
        this.speedLimit = speedLimit;
        this.color = color;
    }

    void increaseSpeed(int increment) {
        if((this.speed + increment) < speedLimit) {
            this.speed += increment;
        }
    }
    void decreaseSpeed(int decrease) {
        if (this.speed > 0){
            this.speed -= decrease;
        }
    }
    void printSpeed(){
        System.out.println(this.model + "Hiziniz : " + this.speed);
    }
    void printInfo(){
        System.out.println("Model : " + this.model);
        System.out.println("Color : " + this.color);
        System.out.println("Speed : " + this.speed);
        System.out.println("Speed Limit : " + this.speedLimit);
    }
}
