package cn.ezios.springboot01HelloWorld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName RouteController
 * @Description TODO
 * @Date 2019/1/3 18:12
 * @Creaded By Wangj
 */
@Controller
public class RouteController {

    @RequestMapping("img_up")
    public String imgUpload(){
        return "image_up/upload.html";
    }
}
