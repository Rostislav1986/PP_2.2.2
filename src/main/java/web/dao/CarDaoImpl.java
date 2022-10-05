package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Repository
public class CarDaoImpl implements CarDao{
    private static final List<Car> carsList = new ArrayList<>();

    static {
        carsList.add(new Car("Mercedes-Benz", 221, 2010));
        carsList.add(new Car("BMW", 525, 2016));
        carsList.add(new Car("AUDI", 101, 2009));
        carsList.add(new Car("Skoda", 404, 2018));
        carsList.add(new Car("Opel", 515, 2020));
    }
    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carsList;
        }
        return carsList.stream().limit(count).collect(Collectors.toList());
    }

}
