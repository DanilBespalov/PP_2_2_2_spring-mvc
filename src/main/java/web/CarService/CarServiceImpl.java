package web.CarService;

import web.model.Car;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private int count = 0;
    List<Car> carList = new ArrayList<>();

    {
        carList.add(++count, new Car("Model1", "driverName1", 1));
        carList.add(++count, new Car("Model2", "driverName2", 2));
        carList.add(++count, new Car("Model3", "driverName3", 3));
        carList.add(++count, new Car("Model4", "driverName4", 4));
        carList.add(++count, new Car("Model5", "driverName5", 5));

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
