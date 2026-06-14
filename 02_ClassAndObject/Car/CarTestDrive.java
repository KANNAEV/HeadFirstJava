public class CarTestDrive {

    public static void main(String[] args) {

        Car car1 = new Car(); // создание объекта класса Car
        car1.brand = "Toyota"; // присвоение значения полю brand объекта car1
        car1.model = "Camry"; // присвоение значения полю model объекта car1
        car1.year = 2020; // присвоение значения полю year объекта car1

        System.out.println("Car 1: " + car1.brand + " " + car1.model + " (" + car1.year + ")");
        car1.start(); // Вызов метода start() для объекта car1
        car1.stop(); // Вызов метода stop() для объекта car1

        // создание второго объекта класса Car
        Car car2 = new Car();
        car2.brand = "Honda";
        car2.model = "Civic";
        car2.year = 2019;

        System.out.println("Car 2: " + car2.brand + " " + car2.model + " (" + car2.year + ")");
        car2.start();
        car2.stop();
    }

}
