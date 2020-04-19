package com.shayne.wechat.web.dao;

import com.shayne.wechat.web.bean.Shop;
import com.shayne.wechat.web.bean.ShopWithBLOBs;

import java.util.List;

public interface ShopDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopWithBLOBs record);

    int insertSelective(ShopWithBLOBs record);

    ShopWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShopWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ShopWithBLOBs record);

    int updateByPrimaryKey(Shop record);

    List<ShopWithBLOBs> getShops(ShopWithBLOBs search);
}