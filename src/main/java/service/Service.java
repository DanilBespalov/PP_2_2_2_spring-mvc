package service;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.List;


public interface Service {

    public List<Car> getCarList();
    public Car getCarListByIndex(int index);
}
