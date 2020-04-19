package com.shayne.wechat.web.bean;

import java.io.Serializable;

/**
 * shop
 * @author 
 */
public class ShopWithBLOBs extends Shop implements Serializable {
    /**
     * 描述
     */
    private String description;

    /**
     * logo
     */
    private byte[] logo;

    private byte[] pic;

    private static final long serialVersionUID = 1L;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }
}