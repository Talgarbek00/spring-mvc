package web.dao;

import web.model.Car;

import java.util.List;

public interface DaoInterface {
    List<Car> countGet(int number);
    List<Car> getAll();
}
