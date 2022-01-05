package ro.fasttrackit.curs12.homework.ex5;

import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        CarShop carShop = new CarShop(List.of(
                new Car("Volvo",8,150000,9000),
                new Car("Dacia",5,70000,6000),
                new Car("Ford",7,120000,9500),
                new Car("Toyota",5,75000,12000),
                new Car("Dacia",9,65000,4500),
                new Car("Ford",6,95000,11000)
        ));

        System.out.println(carShop);
        System.out.println(carShop.mapNameNumber());
        System.out.println(carShop.mapNameKm());
        System.out.println(carShop.mapKmCar());
        System.out.println(carShop.mapPriceCar());
    }
}
