package com.example.danmark_mod_madspild.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController
{

    @GetMapping("/forside")
    public String forside()
    {
        return "home/forside";
    }

    @GetMapping("/privat-bliv-aktiv")
    public String privatBlivAktiv()
    {
        return "privatBlivAktiv";
    }

    @GetMapping("/virksomhed-info")
    public String virksomhedInfo()
    {
        return "virksomhedInfo";
    }

}
