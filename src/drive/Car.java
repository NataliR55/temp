package drive;

import java.util.HashSet;
import java.util.Objects;

public class Car {

    protected int productionYear;
    protected int power;


    public static void main(String[] args) {
        Jeep jeep1 = new Jeep(2020, 146);
        Jeep jeep2 = new Jeep(2020, 146);

        HashSet<Car> cars = new HashSet<>();
        cars.add(jeep1);
        cars.add(jeep2);

        System.out.println("size: " + cars.size());

    }

    public Car(int productionYear, int power) {
        this.productionYear = productionYear;
        this.power = power;
    }

    public boolean equals(Jeep jeep) {
        return productionYear == jeep.productionYear && power == jeep.power;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Car car = (Car) o;
//        return productionYear == car.productionYear && power == car.power;
//    }

    @Override
    public int hashCode() {
        int rez = Objects.hash(productionYear, power);
        return rez;
    }
}

class Jeep extends Car {

    public Jeep(int productionYear, int power) {
        super(productionYear, power);
    }
}