package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", "Sedan"));
        cars.add(new Car("Bmw", "SUV"));
        cars.add(new Car("Ferrari", "Sedan"));

        // descending order sorting, using comparator.
        Collections.sort(cars, (Car obj1, Car obj2) -> obj2.carName.compareTo(obj1.carName));
        
        cars.forEach((Car car) -> System.out.println(car.carName+ " " + car.carType));


        // using comparator interface
        Collections.sort(cars, new CarNameComparator());

        cars.forEach((Car car) -> System.out.println(car.carName+ " " + car.carType));
    }
}
