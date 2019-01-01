package cn.ezios.springboot01HelloWorld.controller;

import cn.ezios.springboot01HelloWorld.Springboot01HelloWorldApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName SampleController
 * @Description TODO
 * @Date 2019/1/1 16:31
 * @Creaded By Wangj
 */
@Controller
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "hello world!";
    }

}
