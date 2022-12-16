package CarService;

import model.Car;

import java.util.List;


public interface CarService {

    public List<Car> getCarList();
    public Car getCarListByIndex(int index);
}
