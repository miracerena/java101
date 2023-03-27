package src;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("RS 7 Sportback", 100, 250, "Red");
        audi.printInfo();

        /*
        Car audi = new Car();
        audi.model = "RS 7 Sportback";
        audi.speed = 180;
        audi.speedLimit = 250;
        audi.color = "Red";
        audi.increaseSpeed(10);
        System.out.println(audi.model + "Hizi : " + audi.speed);

        Car bmw = new Car();
        bmw.model = "420i Coupe";
        bmw.speed = 170;
        bmw.speedLimit = 230;
        bmw.color = "Blue";
        bmw.increaseSpeed(20);
        bmw.printSpeed();

         */


    }
}
