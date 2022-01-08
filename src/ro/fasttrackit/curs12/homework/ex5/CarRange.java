package ro.fasttrackit.curs12.homework.ex5;

import java.util.Objects;

public class CarRange {

    public int minRange;
    public int maxRange;

    public CarRange(int minRange, int maxRange){
        this.minRange = minRange;
        this.maxRange = maxRange;
    }

    @Override
    public String toString() {
        return "CarRange{" +
                "minRange=" + minRange +
                ", maxRange=" + maxRange +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarRange carRange = (CarRange) o;
        return minRange == carRange.minRange && maxRange == carRange.maxRange;
    }

    @Override
    public int hashCode() {
        return Objects.hash(minRange, maxRange);
    }
}
