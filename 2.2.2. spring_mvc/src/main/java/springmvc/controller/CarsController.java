package springmvc.controller;

import springmvc.model.Car;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import springmvc.service.CarServiceImp;

import java.util.List;

@Controller
@PropertySource("classpath:Bundle.properties")
public class CarsController {

  @Value("${title_en}")
  private String enTitle;

  @Value("${title_ru}")
  private String ruTitle;

  @GetMapping("/cars")
  public String printCars(Model model, String locale) {
    List<Car> carList = new CarServiceImp().getAllCars();
    model.addAttribute("cars", carList);
    if ("en".equals(locale)) {
      model.addAttribute("title", enTitle);
    } else if ("ru".equals(locale)) {
      model.addAttribute("title", ruTitle);
    } else {
      model.addAttribute("title", "Empty");
    }
    return "cars";
  }
}