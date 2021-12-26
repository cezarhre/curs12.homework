package ro.fasttrackit.curs12.homework.ex5;

import java.util.*;

public class CarShop {

    private final List<Car> carShop;

    public CarShop(List<Car> carShop) {
        this.carShop = carShop == null
                ? new ArrayList<>()
                : new ArrayList<>(carShop);
    }

    public Map<String, Integer> mapNameNumber() {
        Map<String, Integer> result = new HashMap<>();
        for (Car car : carShop) {
             result.put(car.getName(), carShop.size());
           }
        return result;
    }

    public Map<String, Integer> mapNameKm() {
        Map<String, Integer> result = new HashMap<>();
        int sum = 0;
        for (Car car : carShop) {
            sum += car.getKm();
        }
        for (Car car : carShop){                    // stiu ca nu arata bine dar nu am gasit alta solutie...
            result.put(car.getName(), sum);
        }
        return result;
    }

    public Map<Integer, List<Car>> mapKmCar() {
        Map<Integer, List<Car>> range = new HashMap<>();
        for (Car car : carShop) {
            List<Car> carShopList = new ArrayList<>();
            if (car.getKm() > 1 && car.getKm() < 100000) {
                range.put(car.getKm(), carShopList);
            }
            carShopList.add(car);
        }
        return range;
    }

    public Map<Integer, List<Car>> mapPriceCar(){
        Map<Integer, List<Car>> range = new HashMap<>();
        for(Car car : carShop){
            List<Car> carShopList = new ArrayList<>();
            if(car.getPrice() > 1 && car.getPrice() < 10000){
            range.put(car.getPrice(), carShopList);
            }
            carShopList.add(car);
        }
        return range;
}

    @Override
    public String toString() {
        return "CarShop{" +
                "carShop=" + carShop +
                '}';
    }
}
