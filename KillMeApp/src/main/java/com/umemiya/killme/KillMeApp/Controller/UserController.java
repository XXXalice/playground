package com.umemiya.killme.KillMeApp.Controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/")
    public String index() {
        return "Hello.";
    }

    @RequestMapping("/{num}")
    public String numTest(
            @PathVariable int num
    ) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        return "total: " + String.valueOf(result);
    }
}
