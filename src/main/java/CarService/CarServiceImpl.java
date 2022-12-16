package CarService;

import model.Car;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    List<Car> carList = new ArrayList<>();

    {
        carList.add(1, new Car("Model1", "driverName1", 1));
        carList.add(2, new Car("Model2", "driverName2", 2));
        carList.add(3, new Car("Model3", "driverName3", 3));
        carList.add(4, new Car("Model4", "driverName4", 4));
        carList.add(5, new Car("Model5", "driverName5", 5));

    }
    @Override
    public List<Car> getCarList() {
        return carList;
    }

    @Override
    public Car getCarListByIndex (int index) {
        return carList.stream().filter(car -> car.getSeriesCar() == index).findAny().orElse(null);
    }

}
