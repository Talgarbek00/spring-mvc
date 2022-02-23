package web.service;

import web.dao.Dao;
import web.dao.DaoInterface;
import web.model.Car;

import java.util.List;

public class ServiceImpl implements Service {
    DaoInterface daoInterface = new Dao();

    @Override
    public List<Car> countGet(int number) {
        return daoInterface.countGet(number);
    }

    @Override
    public List<Car> getAll() {
        return daoInterface.getAll();
    }
}
