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
            Integer count = result.get(car.getName());
            result.put(car.getName(), count == null ? 1 : count + 1);
        }
        return result;
    }

    public Map<String, Integer> mapNameKm() {
        Map<String, Integer> result = new HashMap<>();
        for (Car car : carShop) {
            Integer count = result.get(car.getName());
            result.put(car.getName(), count == null ? car.getKm() : count + car.getKm());
        }
        return result;
    }

    public Map<CarRange, List<Car>> mapKmCar(List<CarRange> rangeKm) {
        Map<CarRange, List<Car>> range = new HashMap<>();
        for (CarRange range1 : rangeKm) {
            List<Car> carShopList = new ArrayList<>();
            for (Car car : carShop) {
                if (car.getKm() > range1.minRange && car.getKm() < range1.maxRange) {
                    carShopList.add(car);
                }
            }
            range.put(range1, carShopList);
        }
        return range;
    }

    public Map<CarRange, List<Car>> mapPriceCar(List<CarRange> rangePrice) {
        Map<CarRange, List<Car>> range = new HashMap<>();
        for (CarRange range1 : rangePrice) {
            List<Car> carShopList = new ArrayList<>();
            for (Car car : carShop) {
                if (car.getPrice() > range1.minRange && car.getPrice() < range1.maxRange) {
                    carShopList.add(car);
                }
            }
            range.put(range1, carShopList);
        }
        return range;
    }
}


