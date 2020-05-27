package com.umemiya.killme.KillMeApp.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IconController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
