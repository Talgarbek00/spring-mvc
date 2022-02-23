package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.DaoInterface;
import web.service.Service;
import web.service.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    Service service = new ServiceImpl();
    @GetMapping
    public String printWelcome(ModelMap model) {
        model.addAttribute("car1",service.getAll());
        return "/cars";
    }
    @GetMapping("/")
    public String getByNumber(@RequestParam("count") int count, Model model){
        model.addAttribute("car1",service.countGet(count));
        return "/cars";
    }
}
