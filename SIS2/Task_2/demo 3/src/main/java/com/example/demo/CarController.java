package com.example.demo;

import com.example.demo.model.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    private final Car car;

    // Spring автоматически внедрит Car
    public CarController(Car car) {
        this.car = car;
    }

    @GetMapping("/car")
    public String getCarInfo() {
        return car.toString();
    }
}
