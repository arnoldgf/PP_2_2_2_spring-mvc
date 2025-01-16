package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiseImpl implements CarService{

    private List<Car> cars;

    public CarServiseImpl() {
        cars = new ArrayList<Car>();
        cars.add(new Car("Model S", "Tesla", 2022));
        cars.add(new Car("Civic", "Honda", 2020));
        cars.add(new Car("Mustang", "Ford", 2021));
        cars.add(new Car("Camry", "Toyota", 2019));
        cars.add(new Car("X5", "BMW", 2023));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count > 0 && count < cars.size()) {
            return cars.subList(0, count);
        }
        return cars;
    }
}
