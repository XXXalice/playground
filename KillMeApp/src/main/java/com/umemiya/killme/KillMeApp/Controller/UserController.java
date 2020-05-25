package com.umemiya.killme.KillMeApp.Controller;


import com.umemiya.killme.KillMeApp.Controller.items.UserItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;

@RestController
public class UserController {

    FileInputStream fi = null;
    InputStreamReader is = null;
    BufferedReader reader = null;

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

    @RequestMapping("/{id}")
    public UserItem find(
            @PathVariable int id
    ) {

    }

    private UserItem _generateUserSeed() {
        try {
            try {
                fi = new FileInputStream("./items/nameSeeds.csv");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
            is = new InputStreamReader(fi);
            reader = new BufferedReader(is);

            String[] cols = reader.readLine().split(",");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
