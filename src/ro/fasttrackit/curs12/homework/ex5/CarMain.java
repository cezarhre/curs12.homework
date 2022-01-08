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
                new Car("Ford",6,95000,11000)));

        List<CarRange> rangeKm = List.of(
                new CarRange(50000, 80000),
                new CarRange(80001, 100000),
                new CarRange(100001, 150000));

        List<CarRange> rangePrice = List.of(
                new CarRange(2000, 5000),
                new CarRange(5001, 10000),
                new CarRange(10001, 15000));

        System.out.println(carShop.mapNameNumber());
        System.out.println(carShop.mapNameKm());
        System.out.println(carShop.mapKmCar(rangeKm));
        System.out.println(carShop.mapPriceCar(rangePrice));
    }
}
