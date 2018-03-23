package io.srf.controllers;

import io.srf.models.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String getMainPage(Model model){
        model.addAttribute("request", new Request(4, "Fds sdfsdf"));
        return "home";
    }
//    @GetMapping("/")
//    public String getMainPage(){
//        System.out.println("sdfsdfsd sdf sdf sdfsdf sdf");
//        return "home";
//    }

}
