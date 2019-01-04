package cn.ezios.springboot01HelloWorld.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName UploadController
 * @Description TODO
 * @Date 2019/1/3 18:02
 * @Creaded By Wangj
 */
@RestController
@RequestMapping("upload")
public class UploadController {

    @PostMapping("img")
    public String imgUpload(@RequestParam("img_name") String imgName, MultipartFile img){

        System.out.println(imgName);
        System.out.println(img.getName());
        File dest = new File(("e:/" + img.getName()));
        try {
            img.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
