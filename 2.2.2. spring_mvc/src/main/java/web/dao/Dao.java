package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class Dao implements DaoInterface{
    private long count_id;
    Car car = new Car();
    private static List<Car> carList;
    {
        carList = new ArrayList<>();
        carList.add(new Car(++count_id,"mazda","blue"));
        carList.add(new Car(++count_id,"bmw","black"));
        carList.add(new Car(++count_id,"mers","white"));
        carList.add(new Car(++count_id,"audi","orange"));
        carList.add(new Car(++count_id,"lada","black"));

    }
    public  List<Car> getAll(){
        return carList;
    }

    @Override
    public List<Car> countGet(int number) {
       List<Car> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            if(number>5){
                return carList;
            }else {
                list.add(carList.get(i));
            }
        }
        return list;
    }
}
