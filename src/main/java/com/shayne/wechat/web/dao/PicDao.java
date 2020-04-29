package com.shayne.wechat.web.dao;

import com.shayne.wechat.web.bean.Pic;

import java.util.List;

public interface PicDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Pic record);

    int insertSelective(Pic record);

    Pic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pic record);

    int updateByPrimaryKeyWithBLOBs(Pic record);

    int updateByPrimaryKey(Pic record);

    List<Pic> getPics(Pic search);
}