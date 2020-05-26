package com.umemiya.killme.KillMeApp.Controller;


import com.umemiya.killme.KillMeApp.Controller.items.UserItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.Random;

@RestController
public class UserController {

    FileInputStream fi = null;
    InputStreamReader is = null;
    BufferedReader reader = null;
    Boolean initFlag = false;
    int csvLineNum = 0;

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

    /**
     * stream関連を初期化
     * @param operate 0で初期化処理 1でclose処理
     */
    private void _streamInit(int operate) {
        if (operate == 0) {
            try {
                try {
                    fi = new FileInputStream("./items/nameSeeds.csv");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                is = new InputStreamReader(fi);
                reader = new BufferedReader(is);

                while(reader.readLine() != null) {
                    csvLineNum++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private UserItem _generateUserSeed() {
        if (!initFlag) {
            _streamInit(0);
            initFlag = true;
        }

        int seedInt = new Random().nextInt(csvLineNum + 1);
        try {
            String[] cols = reader.readLine().split(",");
            String line = "";
            int counter = 0;
            while((line = reader.readLine()) != null) {
                counter++;
                if (counter == seedInt) {
                    String[] items = line.split(",");
                    UserItem result = new UserItem(
                            csvLineNum,
                            items[0],
                            items[2]
                            );
                    return result;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
