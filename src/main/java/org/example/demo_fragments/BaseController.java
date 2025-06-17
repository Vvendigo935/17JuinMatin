package org.example.demo_fragments;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {

    @Value("${custom.name}")
    private String name;

    @GetMapping
    public String homePage(Model model){
        model.addAttribute("name",name);
        return "home";
    }

    @GetMapping("/page2")
    public String page2(){
        return "page2";
    }
}
