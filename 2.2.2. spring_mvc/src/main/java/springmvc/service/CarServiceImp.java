package springmvc.service;

import java.util.ArrayList;
import java.util.List;
import springmvc.model.Car;

public class CarServiceImp implements CarService {

  @Override
  public List<Car> getAllCars() {
    List<Car> carList = new ArrayList<Car>();
    carList.add(new Car("Tesla", 50000, 234));
    carList.add(new Car("Nisan", 5000, 195));
    carList.add(new Car("Hunday", 4000, 220));
    return carList;
  }
}
