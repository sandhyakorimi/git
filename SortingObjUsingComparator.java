import java.util.*;

class Car {
    String carName;
    String carType;

    Car(String name, String type) {
        this.carName = name;
        this.carType = type;
    }

    @Override
    public String toString() {
        return carName + " - " + carType;
    }
}

public class SortingObjUsingComparator {
    public static void main(String[] args) {
        Car[] carArray = new Car[3];
        carArray[0] = new Car("suv", "petrol");
        carArray[1] = new Car("sedan", "diesel");
        carArray[2] = new Car("HatchBack", "cng");

        // Sort by carName
        Arrays.sort(carArray, Comparator.comparing(c -> c.carName));

        // Print sorted array
        for (Car c : carArray) {
            System.out.println(c);
        }
    }
}
