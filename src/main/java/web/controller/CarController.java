package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;


@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService carService = new CarServiceImp();

    @GetMapping()
    public String getCars(@RequestParam(value = "count", required  = false) Integer count, Model model) {
        if (count == null) {
            model.addAttribute("cars", carService.getCars() );
        } else if (count > 0 && count < 6) {
            model.addAttribute("cars", carService.getCars(count) );
        }
        return "/cars";
    }
}
