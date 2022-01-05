package ro.fasttrackit.curs12.homework.ex5;

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
}
