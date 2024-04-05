package web.service;

import org.springframework.stereotype.Service;
import web.pojo.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService{
    private final List<Car> cars = new ArrayList<>();

    public CarServiceImp () {
        cars.add(new Car("Audi", "A6", 2006) );
        cars.add(new Car("Audi", "A4", 2009) );
        cars.add(new Car("Mazda", "X3", 2012) );
        cars.add(new Car("Honda", "Civic", 1999) );
        cars.add(new Car("Opel", "Vectra", 2015) );

    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, count);
    }


}
