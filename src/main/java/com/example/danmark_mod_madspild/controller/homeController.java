package com.example.danmark_mod_madspild;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController
{

    @GetMapping("/")
    public String forside()
    {
        return "home/forside";
    }

//hj

}
