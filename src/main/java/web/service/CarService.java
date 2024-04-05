package web.service;

import web.pojo.Car;

import java.util.List;

public interface CarService {

    List<Car> getCars();

    List<Car> getCars(int count);
}
