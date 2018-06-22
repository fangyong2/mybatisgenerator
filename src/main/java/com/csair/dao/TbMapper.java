package com.csair.dao;

import com.csair.model.Tb;

public interface TbMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tb record);

    int insertSelective(Tb record);

    Tb selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tb record);

    int updateByPrimaryKey(Tb record);
}