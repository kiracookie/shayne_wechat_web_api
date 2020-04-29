package com.shayne.wechat.web.entity;

import com.shayne.wechat.web.bean.ShopWithBLOBs;

import java.io.Serializable;

public class Search implements Serializable {
    String key;
    String region;

    String province;
    String city;
    String district;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        String[] regions;
        regions = region.split(",");
        this.province = regions[0].replace("全部","");
        this.city = regions[1].replace("全部","");
        this.district = regions[2].replace("全部","");
        this.region = region;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public ShopWithBLOBs toShopWithBLOBsBean() {
        ShopWithBLOBs shop = new ShopWithBLOBs();
        shop.setName(getKey());
        shop.setAddress(getKey());
        shop.setProvince(getProvince());
        shop.setCity(getCity());
        shop.setDistrict(getDistrict());
        shop.setDescription(getKey());
        return shop;
    }
}
