package com.shayne.wechat.web.api.controller;

import com.shayne.wechat.web.api.entity.SearchAPI;
import com.shayne.wechat.web.bean.Pic;
import com.shayne.wechat.web.bean.ShopWithBLOBs;
import com.shayne.wechat.web.service.PicService;
import com.shayne.wechat.web.service.ShopService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    ShopService shopService;
    @Autowired
    PicService picService;


    @PostMapping(value = "/search", produces = "application/json;charset=UTF-8")
    public List<ShopWithBLOBs> search(@RequestBody SearchAPI search) {

        return shopService.getShops(search.toShopWithBLOBsBean());
    }

    @PostMapping(value = "/getPics", produces = "application/json;charset=UTF-8")
    public List<Pic> getPic(@RequestBody Pic pic) {

        return picService.getPics(pic);
    }

    @RequestMapping(value = "/getShop/{id}")
    public ShopWithBLOBs getShop(@PathVariable(value = "id") Integer id) {

        return shopService.getShop(id);
    }
}
