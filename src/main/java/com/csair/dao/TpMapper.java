package com.csair.dao;

import com.csair.model.Tp;

public interface TpMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tp record);

    int insertSelective(Tp record);

    Tp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tp record);

    int updateByPrimaryKey(Tp record);
}