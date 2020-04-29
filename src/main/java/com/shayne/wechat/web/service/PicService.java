package com.shayne.wechat.web.service;

import com.shayne.wechat.web.bean.Pic;
import com.shayne.wechat.web.dao.PicDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PicService {
    @Autowired
    PicDao picDao;

    public List<Pic> getPics(Pic pic) {
        return picDao.getPics(pic);
    }
}
