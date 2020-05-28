package com.umemiya.killme.KillMeApp.Controller;


import com.umemiya.killme.KillMeApp.Controller.items.UserItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController("/user")
public class UserController {

    FileReader fr = null;
    BufferedReader reader = null;
    Boolean initFlag = false;
    int csvLineNum = 0;
    List<UserItem> userItems = new ArrayList<>();

    @Autowired
    ResourceLoader resourceLoader;

    @RequestMapping("/")
    public String index() {
        return "Hello.";
    }


    @RequestMapping("/{id}")
    public UserItem find(
            @PathVariable int id
    ) {
        _streamInit();
        try {
            return userItems.get(id);
        } catch (Exception e) {
            e.printStackTrace();
            return userItems.get(0);
        }
    }

    /**
     * stream関連を初期化
     */
    private void _streamInit() {
            try {
                try {
                    String filepath = "nameSeed.csv";
                    Resource resource = resourceLoader.getResource("classpath:" + filepath);
                    this.fr = new FileReader(resource.getFile());
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                reader = new BufferedReader(this.fr);
                String line = "";
                while((line = reader.readLine()) != null) {
                    csvLineNum++;
                    String[] cols = line.split(",");
                    UserItem userItem = new UserItem(
                            csvLineNum,
                            cols[0],
                            cols[1]
                            );
                    userItems.add(userItem);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }

    private UserItem _generateUserSeed() {
        if (!initFlag) {
            _streamInit();
            initFlag = true;
        }

        int seedInt = new Random().nextInt(csvLineNum);

        return userItems.get(seedInt);
    }
}
