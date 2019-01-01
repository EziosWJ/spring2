package cn.ezios.springboot01HelloWorld.controller;

import cn.ezios.springboot01HelloWorld.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName JacksonController
 * @Description TODO
 * @Date 2019/1/1 17:33
 * @Creaded By Wangj
 */
@RestController
@RequestMapping("json")
public class JacksonController {

    private Map<String,Object> map = new HashMap<>();

    @GetMapping("/get_user")
    public Object testJson(){
        new UserModel();
        return new UserModel("das","d","a",1,"0000",new Date());
    }
}
