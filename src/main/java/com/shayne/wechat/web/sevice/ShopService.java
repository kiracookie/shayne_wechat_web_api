package com.shayne.wechat.web.sevice;

import com.shayne.wechat.web.bean.Shop;
import com.shayne.wechat.web.bean.ShopWithBLOBs;
import com.shayne.wechat.web.dao.ShopDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {
    @Autowired
    ShopDao shopDao;

    public List<ShopWithBLOBs> getShops(ShopWithBLOBs shop){

        return shopDao.getShops(shop);
    }

}
