package com.shayne.wechat.web.api.controller;

import com.alibaba.fastjson.JSONObject;
import com.shayne.wechat.web.api.entity.SearchAPI;
import com.shayne.wechat.web.sevice.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class ApiController {
    @Autowired
    ShopService shopService;


//    @RequestMapping("/web/index")
//    public String sayHello() {
//        return "login";
//    }

    /**
     * 查询方法
     *
     * @param search
     * @return
     */
    @ResponseBody
    @PostMapping(value = "/search", produces = "application/json;charset=UTF-8")
    public String search(@RequestBody SearchAPI search) {


        return JSONObject.toJSONString(shopService.getShops(search.toShopWithBLOBsBean()));
    }
}
