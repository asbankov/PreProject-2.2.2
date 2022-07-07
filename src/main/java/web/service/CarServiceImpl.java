package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private List<Car> cars = new ArrayList<>();

    @Override
    public void add(String model, int productionYear, int distance) {
        cars.add(new Car(model, productionYear, distance));
    }

    @Override
    public List<Car> carsList(int quantity) {
        return cars.subList(0, Math.min(quantity, cars.size()));
    }

    @Override
    public void addFive() {
        add("Audi", 2013, 20000);
        add("Opel", 2020, 10000);
        add("Volkswagen", 2010, 100000);
        add("BMW", 2019, 35000);
        add("Mercedes", 2020, 30000);
    }

    @Override
    public boolean isEmpty() {
        return cars.isEmpty();
    }
}
