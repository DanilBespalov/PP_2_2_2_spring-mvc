package web.controller;

import CarService.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService serviceCar;
    @GetMapping("/all")
    public String printAllCars(Model model) {
        model.addAttribute("cars", serviceCar.getCarList());
        return "cars/cars";
    }

    @GetMapping("/{index}")
    public String showCarByID(@PathVariable("index") int index, Model model) {
        model.addAttribute("car", serviceCar.getCarListByIndex(index));
        return "cars/car_index";
    }
}
