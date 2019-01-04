package cn.ezios.springboot01HelloWorld.controller;

import cn.ezios.springboot01HelloWorld.model.UserModel;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName RestfulController
 * @Description TODO
 * @Date 2019/1/1 16:52
 * @Creaded By Wangj
 */
@RestController
public class RestfulController {

    private Map<String,Object> map = new HashMap<String,Object>();

    @RequestMapping("testJson")
    Map<String,Object> testJson(){
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("name","wj");
        return stringObjectHashMap;
    }

    @RequestMapping(value = "/rest/{city_id}/{user_id}",method = RequestMethod.GET)
    Map<String,Object> testGet(@PathVariable("city_id") String cityId,@PathVariable("user_id") String user_id){
        map.clear();
        map.put("city",cityId);
        map.put("user",user_id);
        return  map;
    }
    @GetMapping("/rest/page")
    Map<String,Object> testRestGet(Integer from,Integer size){
        map.clear();
        map.put("from",from);
        map.put("size",size);
        return  map;
    }

    @GetMapping("rest/page2")
    Map<String,Object> testRestGet2(@RequestParam(defaultValue = "1") Integer from,Integer size){
        map.clear();
        map.put("from",from);
        map.put("size",size);
        return  map;
    }

    @RequestMapping("rest/save_user")
    //RequestBody 要求请求头为content-type为application/json
    Map<String,Object> testSaveUser(@RequestBody UserModel user){
        map.clear();
        map.put("user",user);
        System.out.println(user);
        return  map;
    }

    @RequestMapping("rest/header")
    Map<String,Object> testRestHeader(@RequestHeader("token") String token){
        map.clear();
        map.put("header-token",token);
        return  map;
    }
}
