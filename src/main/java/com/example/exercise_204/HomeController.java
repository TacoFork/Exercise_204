package com.example.exercise_204;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {

    @GetMapping("/carform")
    public String loadCarForm(Model model){
        model.addAttribute("car", new Car());
        return "carform";
    }

    @PostMapping("/confirmform")
    public String loadConfirmForm(@Valid Car car, BindingResult result){
        if (result.hasErrors()){
            return "carform";
        }
        return "confirm";
    }
}
